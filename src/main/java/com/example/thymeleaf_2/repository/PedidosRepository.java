package com.example.thymeleaf_2.repository;

import com.example.thymeleaf_2.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
}
