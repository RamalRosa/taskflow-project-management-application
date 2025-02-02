package com.ramal.taskflow.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        log.info("hello 👋");
        return "Hello World from Test Controller 👋 | Version: 0.0.1 | 2025-01-21 ";
    }
}
