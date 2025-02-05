package com.memo.love.controllers;

import com.memo.love.DTO.DateSelectionDTO;
import com.memo.love.Models.DateSelection;
import com.memo.love.repository.DateSelectionRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*")
public class DateController {
    
    @Autowired
    private DateSelectionRepository dateSelectionRepository;

   

    // Guardar la fecha seleccionada
    @PostMapping("/guardar-fecha")
    public ResponseEntity<Map<String, String>> guardarFecha(@RequestBody DateSelectionDTO dateSelectionDTO) {
        try {
            DateSelection dateSelection = dateSelectionDTO.toEntity();
            dateSelectionRepository.save(dateSelection);
            
            Map<String, String> response = new HashMap<>();
            response.put("message", "Fecha guardada correctamente");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", e.getMessage());
            return ResponseEntity.badRequest().body(errorResponse);
        }
    }

    // Obtener todas las fechas guardadas
    @GetMapping("/fechas")
    public ResponseEntity<List<DateSelection>> getDates() {
        List<DateSelection> fechas = dateSelectionRepository.findAll();
        return ResponseEntity.ok(fechas);
    }
}
