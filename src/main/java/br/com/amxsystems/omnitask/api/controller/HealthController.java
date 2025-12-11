package br.com.amxsystems.omnitask.api.controller;

import br.com.amxsystems.omnitask.application.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/ping")
    public String ping() {
        return healthService.ping();
    }
}

