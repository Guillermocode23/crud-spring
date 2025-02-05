package com.memo.love.DTO;



import java.util.List;

public class ActivitySelectionDTO {
    
    private List<String> selectedActivities;

    // Constructor vacío (necesario para frameworks como Spring)
    public ActivitySelectionDTO() {
    }

    // Constructor con parámetros
    public ActivitySelectionDTO(List<String> selectedActivities) {
        this.selectedActivities = selectedActivities;
    }

    // Getters y Setters
    public List<String> getSelectedActivities() {
        return selectedActivities;
    }

    public void setSelectedActivities(List<String> selectedActivities) {
        this.selectedActivities = selectedActivities;
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return "ActivitySelectionDTO{" +
                "selectedActivities=" + selectedActivities +
                '}';
    }
}
