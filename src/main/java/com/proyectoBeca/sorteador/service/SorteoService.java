package com.proyectoBeca.sorteador.service;

import com.proyectoBeca.sorteador.model.Sorteo;
import com.proyectoBeca.sorteador.repository.SorteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorteoService implements ISorteoService{
    @Autowired
    private SorteoRepository sorteoRepository;

    @Override
    public List<Sorteo> getSorteos() {
        return sorteoRepository.sortear();
    }

    @Override
    public void init() {
        sorteoRepository.init();
    }

    @Override
    public Sorteo getUltimoSorteo() {
        return sorteoRepository.findLastSorteo();
    }

}
