package com.example.thymeleaf_2.service.componentesService;

import com.example.thymeleaf_2.model.Componentes;

import java.util.Optional;

public interface IComponentesService {

    Object findAll();
    Optional<Componentes> findById(Long id);
    Componentes create(Componentes Componentes);
    Componentes update(Componentes Componentes);
    void delete(Long id);
}
