package com.memo.love.controllers;

import com.memo.love.DTO.DateSelectionDTO;
import com.memo.love.Models.DateSelection;
import com.memo.love.repository.DateSelectionRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Permitir peticiones desde el frontend
public class DateController {

    @Autowired
    private DateSelectionRepository dateSelectionRepository;

   

    // Guardar la fecha seleccionada
    @PostMapping("/guardar-fecha")
    public ResponseEntity<?> guardarFecha(@RequestBody DateSelectionDTO dateSelectionDTO) {
        try {
           
            return ResponseEntity.ok().body("Fecha guardada correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al guardar la fecha: " + e.getMessage());
        }
    }

    // Obtener todas las fechas guardadas
    @GetMapping("/fechas")
    public List<DateSelection> getDates() {
        return dateSelectionRepository.findAll();
    }
}
