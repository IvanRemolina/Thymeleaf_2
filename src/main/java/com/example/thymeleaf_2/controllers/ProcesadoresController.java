package com.example.thymeleaf_2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProcesadoresController {
    @RequestMapping(value="/componentes/procesadores")
    public String index(Model model) {
        model.addAttribute("metaTitle", "Procesadores");




        return "procesadores";
    }
}

