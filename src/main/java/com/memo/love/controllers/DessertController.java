package com.memo.love.controllers;



import com.memo.love.Models.DessertSelection;
import com.memo.love.repository.DessertSelectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Permitir peticiones desde el frontend
public class DessertController {

    @Autowired
    private DessertSelectionRepository dessertSelectionRepository;

    // Guardar una selección de postre
    @PostMapping("/guardar-postre")
    public ResponseEntity<DessertSelection> saveDessert(@RequestBody String dessertItem) {
        DessertSelection dessertSelection = new DessertSelection();
        dessertSelection.setDessertItem(dessertItem);
        return ResponseEntity.ok(dessertSelectionRepository.save(dessertSelection));
    }

    // Obtener todas las selecciones de postres
    @GetMapping("/postres")
    public List<DessertSelection> getDesserts() {
        return dessertSelectionRepository.findAll();
    }
}