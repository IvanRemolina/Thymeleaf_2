package com.example.thymeleaf_2.repository;

import com.example.thymeleaf_2.model.Componentes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentesRepository extends JpaRepository<Componentes, Long> {
}