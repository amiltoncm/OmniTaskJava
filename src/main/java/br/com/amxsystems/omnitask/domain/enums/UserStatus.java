package br.com.amxsystems.omnitask.domain.enums;

public enum UserStatus {
    ACTIVE("Usuário ativo"),
    INACTIVE("Usuário inativo"),
    BLOCKED("Usuário bloqueado");

    private final String description;

    UserStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
