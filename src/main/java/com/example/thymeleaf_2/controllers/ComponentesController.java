package com.example.thymeleaf_2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComponentesController {
    @RequestMapping(value="/componentes")
    public String index(Model model) {
        model.addAttribute("metaTitle", "Componentes");




        return "componentes";
    }
}

