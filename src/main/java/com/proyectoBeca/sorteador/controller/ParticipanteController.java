package com.proyectoBeca.sorteador.controller;

import com.proyectoBeca.sorteador.dto.CargarExcelDTO;
import com.proyectoBeca.sorteador.model.Participante;
import com.proyectoBeca.sorteador.service.IParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("participante/")
public class ParticipanteController {
    @Autowired
    private IParticipanteService participanteService;

    @GetMapping("listar")
    public List<Participante> listarParticipantes(){
        return participanteService.listarParticipante();
    }
    @PostMapping("cargar-excel")
    public ResponseEntity<String> cargarExcel(@RequestBody CargarExcelDTO cargarExcelDTO){
        try {
            participanteService.cargarDesdeExcel(cargarExcelDTO.getFilePatch());
            return ResponseEntity.status(HttpStatus.OK).body("Excel cargado correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se pudo cargar el Excel. " + e.getMessage());
        }
    }
}
