package br.com.amxsystems.omnitask.domain.enums;

public enum TenantStatus {
    ACTIVE("Tenant ativo"),
    INACTIVE("Tenant inativo"),
    SUSPENDED("Tenant suspenso");

    private final String description;

    TenantStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
