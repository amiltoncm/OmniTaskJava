package br.com.amxsystems.omnitask.api.dto;

import jakarta.validation.constraints.NotBlank;

public record RegisterTenantRequest(
        @NotBlank String name,
        @NotBlank String slug
) {}
