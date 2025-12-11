package br.com.amxsystems.omnitask.api.controller;

import br.com.amxsystems.omnitask.api.dto.RegisterTenantRequest;
import br.com.amxsystems.omnitask.api.dto.TenantResponse;
import br.com.amxsystems.omnitask.api.mapper.TenantMapper;
import br.com.amxsystems.omnitask.application.service.TenantService;
import br.com.amxsystems.omnitask.domain.model.Tenant;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/tenants")
@RequiredArgsConstructor
public class TenantController {

    private final TenantService service;
    private final TenantMapper mapper;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public TenantResponse register(@Valid @RequestBody RegisterTenantRequest req) {
        Tenant tenant = service.register(req.name(), req.slug());
        return mapper.toResponse(tenant);
    }

    @GetMapping("/{slug}")
    public TenantResponse get(@PathVariable String slug) {
        var tenant = service.getBySlug(slug);
        return mapper.toResponse(tenant);
    }

    @PostMapping("/{slug}/suspend")
    public TenantResponse suspend(@PathVariable String slug) {
        var tenant = service.suspend(slug);
        return mapper.toResponse(tenant);
    }

    @PostMapping("/{slug}/activate")
    public TenantResponse activate(@PathVariable String slug) {
        var tenant = service.activate(slug);
        return mapper.toResponse(tenant);
    }
}
