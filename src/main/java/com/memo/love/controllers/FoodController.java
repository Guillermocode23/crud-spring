package com.memo.love.controllers;

import com.memo.love.Models.FoodSelection;
import com.memo.love.repository.FoodSelectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Permitir peticiones desde el frontend
public class FoodController {

    @Autowired
    private FoodSelectionRepository foodSelectionRepository;

    // Guardar una selección de comida
    @PostMapping("/guardar-comida")
    public ResponseEntity<FoodSelection> saveFood(@RequestBody String foodItem) {
        FoodSelection foodSelection = new FoodSelection();
        foodSelection.setFoodItem(foodItem);
        return ResponseEntity.ok(foodSelectionRepository.save(foodSelection));
    }

    // Obtener todas las selecciones de comida
    @GetMapping("/comidas")
    public List<FoodSelection> getFoods() {
        return foodSelectionRepository.findAll();
    }
}