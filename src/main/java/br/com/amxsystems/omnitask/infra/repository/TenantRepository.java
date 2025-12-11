package br.com.amxsystems.omnitask.infra.repository;

import br.com.amxsystems.omnitask.domain.model.Tenant;
import br.com.amxsystems.omnitask.domain.enums.TenantStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
    Optional<Tenant> findBySlug(String slug);
    boolean existsBySlug(String slug);
    long countByStatus(TenantStatus status);
}
