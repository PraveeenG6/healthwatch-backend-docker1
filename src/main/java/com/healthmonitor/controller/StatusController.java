package com.healthmonitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StatusController {

    @GetMapping({"/", "/api/ping"})
    public Map<String, String> status() {
        return Map.of(
                "service", "healthwatch-backend",
                "status", "ok"
        );
    }
}
