package com.Cabanas.Tigre.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // Esto buscará `index.html` en `src/main/resources/templates` por defecto.
    }
}
