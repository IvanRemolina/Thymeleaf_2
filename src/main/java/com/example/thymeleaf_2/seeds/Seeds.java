package com.example.thymeleaf_2.seeds;


import com.example.thymeleaf_2.model.Ordenadores;
import com.example.thymeleaf_2.repository.OrdenadoresRepository;

public class Seeds {
    private OrdenadoresRepository ordenadoresrepository;

    public Seeds(OrdenadoresRepository ordenadoresrepository) {this.ordenadoresrepository = ordenadoresrepository; }

    public void generateSeeds(){

        Ordenadores ordenador = new Ordenadores("Ordenador HP","Lo mas y potente al mejor precio", 7.5);
        ordenadoresrepository.save(ordenador);

    }

}
