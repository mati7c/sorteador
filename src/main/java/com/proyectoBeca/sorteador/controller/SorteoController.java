package com.proyectoBeca.sorteador.controller;


import com.proyectoBeca.sorteador.model.Sorteo;
import com.proyectoBeca.sorteador.service.ISorteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sorteo/")
public class SorteoController {

    @Autowired
    ISorteoService sorteoService;

    @GetMapping("listar")
    public List<Sorteo> getSorteos(){
        return sorteoService.getSorteos();
    }

    @GetMapping("cargar-datos")
    public void init(){
        sorteoService.init();
    }

    @GetMapping("ultimo-sorteo")
    public Sorteo getLastSorteo(){
        return sorteoService.getUltimoSorteo();
    }
}
