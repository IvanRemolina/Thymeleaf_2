package com.example.thymeleaf_2.controllers;

import com.example.thymeleaf_2.model.Componentes;
import com.example.thymeleaf_2.service.componentesService.ComponentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

public class AñadirComponentesController {

@Autowired
private ComponentesService componentesService;

@GetMapping("/componentes/nuevo")
public String home(Model model){
        Componentes componentes = new Componentes();
        model.addAttribute("componentes", componentes);
        return "nuevo_componente";
        }

@PostMapping("/componentes/nuevo")
public String create(@Valid @ModelAttribute Componentes componentes, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
        return "nuevo_componente";
        }
        componentesService.create(componentes);
        return "redirect:/componentes/nuevo";
        }
        }