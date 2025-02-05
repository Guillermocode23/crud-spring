package com.memo.love.DTO;



import java.util.List;

public class DessertSelectionDTO {
    
    private List<String> selectedDesserts;

    // Constructor vacío (necesario para frameworks como Spring)
    public DessertSelectionDTO() {
    }

    // Constructor con parámetros
    public DessertSelectionDTO(List<String> selectedDesserts) {
        this.selectedDesserts = selectedDesserts;
    }

    // Getters y Setters
    public List<String> getSelectedDesserts() {
        return selectedDesserts;
    }

    public void setSelectedDesserts(List<String> selectedDesserts) {
        this.selectedDesserts = selectedDesserts;
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return "DessertSelectionDTO{" +
                "selectedDesserts=" + selectedDesserts +
                '}';
    }
}
