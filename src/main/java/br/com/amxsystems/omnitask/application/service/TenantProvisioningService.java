package br.com.amxsystems.omnitask.application.service;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@RequiredArgsConstructor
public class TenantProvisioningService {

    private final JdbcTemplate jdbcTemplate;

    public void provisionSchema(String tenantSlug) {
        String schema = schemaName(tenantSlug);
        // Usa placeholders para evitar concatenação direta
        jdbcTemplate.execute(String.format("CREATE SCHEMA IF NOT EXISTS %s", schema));
        // Aqui você pode rodar migrações específicas do schema
    }

    private String schemaName(String tenantSlug) {
        if (!StringUtils.hasText(tenantSlug)) {
            throw new IllegalArgumentException("Tenant slug não pode ser vazio");
        }
        // Normaliza o slug: minúsculo, substitui caracteres inválidos por "_"
        return "t_" + tenantSlug
                .toLowerCase()
                .replaceAll("[^a-z0-9_]", "_");
    }
}
