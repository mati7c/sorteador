package com.proyectoBeca.sorteador.service;

import com.proyectoBeca.sorteador.model.Participante;

import java.util.List;

public interface IParticipanteService {
    public List<Participante> listarParticipante();
    public void cargarDesdeExcel(String filePatch);
}
