package br.com.amxsystems.omnitask.application.service;

import br.com.amxsystems.omnitask.domain.model.Tenant;
import br.com.amxsystems.omnitask.domain.enums.TenantStatus;
import br.com.amxsystems.omnitask.infra.repository.TenantRepository;
import br.com.amxsystems.omnitask.common.error.DomainException;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TenantService {

    private final TenantRepository tenants;
    private final TenantProvisioningService provisioning;

    @Transactional
    public Tenant register(String name, String slug) {
        validateSlugAvailability(slug);

        Tenant tenant = Tenant.builder()
                .name(name)
                .slug(slug)
                .status(TenantStatus.ACTIVE)
                .build();

        Tenant saved = tenants.save(tenant);
        provisioning.provisionSchema(saved.getSlug());
        return saved;
    }

    @Transactional(readOnly = true)
    public Tenant getBySlug(String slug) {
        return tenants.findBySlug(slug)
                .orElseThrow(() -> new DomainException("Usuário não encontrado: " + slug));
    }

    @Transactional
    public Tenant suspend(String slug) {
        return updateStatus(slug, TenantStatus.SUSPENDED);
    }

    @Transactional
    public Tenant activate(String slug) {
        return updateStatus(slug, TenantStatus.ACTIVE);
    }

    // --- Métodos privados auxiliares ---

    private void validateSlugAvailability(String slug) {
        if (tenants.existsBySlug(slug)) {
            throw new DomainException("Usuário já utilizado: " + slug);
        }
    }

    private Tenant updateStatus(String slug, TenantStatus status) {
        Tenant tenant = getBySlug(slug);
        tenant.setStatus(status);
        return tenants.save(tenant);
    }
}
