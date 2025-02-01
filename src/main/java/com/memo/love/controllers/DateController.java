package com.memo.love.controllers;



import com.memo.love.Models.DateSelection;
import com.memo.love.repository.DateSelectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Permitir peticiones desde el frontend
public class DateController {

    @Autowired
    private DateSelectionRepository dateSelectionRepository;

    // Guardar la fecha seleccionada
    @PostMapping("/guardar-fecha")
    public ResponseEntity<DateSelection> saveDate(@RequestBody LocalDate selectedDate) {
        DateSelection dateSelection = new DateSelection();
        dateSelection.setSelectedDate(selectedDate);
        return ResponseEntity.ok(dateSelectionRepository.save(dateSelection));
    }

    // Obtener todas las fechas guardadas
    @GetMapping("/fechas")
    public List<DateSelection> getDates() {
        return dateSelectionRepository.findAll();
    }
}