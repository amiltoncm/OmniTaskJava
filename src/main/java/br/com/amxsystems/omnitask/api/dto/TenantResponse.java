package br.com.amxsystems.omnitask.api.dto;

public record TenantResponse(
        Long id,
        String name,
        String slug,
        String status
) {}
