package com.memo.love.DTO;

import java.util.List;

public class FoodSelectionDTO {
    
    private List<String> selectedFoods;

    // Constructor vacío (necesario para frameworks como Spring)
    public FoodSelectionDTO() {
    }

    // Constructor con parámetros
    public FoodSelectionDTO(List<String> selectedFoods) {
        this.selectedFoods = selectedFoods;
    }

    // Getters y Setters
    public List<String> getSelectedFoods() {
        return selectedFoods;
    }

    public void setSelectedFoods(List<String> selectedFoods) {
        this.selectedFoods = selectedFoods;
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return "FoodSelectionDTO{" +
                "selectedFoods=" + selectedFoods +
                '}';
    }
}
