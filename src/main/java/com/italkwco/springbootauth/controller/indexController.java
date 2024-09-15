package com.italkwco.springbootauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class indexController {
    @GetMapping("")
    public List index() {
        return List.of(
                "hello world",
                "welcome"
        );
    }
}
