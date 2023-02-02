package com.example.thymeleaf_2.service.ordenadoresService;


import com.example.thymeleaf_2.model.Ordenadores;

import java.util.Optional;

public interface IOrdenadoresService {
    Object findAll();
    Optional<Ordenadores> findById(Long id);
    Ordenadores create(Ordenadores Ordenadores);
    Ordenadores update(Ordenadores Ordenadores);
    void delete(Long id);

}
