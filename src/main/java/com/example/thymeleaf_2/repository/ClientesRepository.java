package com.example.thymeleaf_2.repository;

import com.example.thymeleaf_2.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
