package br.com.amxsystems.omnitask.application.service;

import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public String ping() {
        return "pong";
    }
}
