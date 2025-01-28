package com.proyectoBeca.sorteador.service;

import com.proyectoBeca.sorteador.model.Participante;
import com.proyectoBeca.sorteador.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ParticipanteService implements IParticipanteService{

    @Autowired
    private ParticipanteRepository participanteRepository;

    @Override
    public List<Participante> listarParticipante() {
        return participanteRepository.findAll();
    }

    @Override
    public void cargarDesdeExcel(String filePatch) {
        try {
            participanteRepository.cargarDesdeExcel(filePatch);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
