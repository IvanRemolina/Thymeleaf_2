package com.example.thymeleaf_2;

import com.example.thymeleaf_2.repository.ClientesRepository;
import com.example.thymeleaf_2.repository.ComponentesRepository;
import com.example.thymeleaf_2.repository.OrdenadoresRepository;
import com.example.thymeleaf_2.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Thymeleaf2Application {

    public static void main(String[] args) {
       SpringApplication.run(Thymeleaf2Application.class, args);
    }
    @Autowired
    OrdenadoresRepository ordenadoresRepository;
    @Autowired
    ComponentesRepository componentesRepository;
    @Autowired
    ClientesRepository clientesRepository;
    @Autowired
    PedidosRepository pedidosRepository;

    /*
    public static void main(String[] args) {
        SpringApplication.run(Thymeleaf2Application.class,args);
    }

    @Bean
    void commandLineRunner(){
        Seeds seeds = new Seeds(ordenadoresRepository);
        seeds.generateSeeds();
    }*/

}