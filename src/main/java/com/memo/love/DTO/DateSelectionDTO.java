package com.memo.love.DTO;


import java.time.LocalDate;

import com.memo.love.Models.DateSelection;

public class DateSelectionDTO {

    private LocalDate selectedDate;

    // Constructor vacío (necesario para frameworks como Spring)
    public DateSelectionDTO() {
    }

    // Constructor con parámetros
    public DateSelectionDTO(LocalDate selectedDate) {
        this.selectedDate = selectedDate;
    }

    // Getters y Setters
    public LocalDate getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(LocalDate selectedDate) {
        this.selectedDate = selectedDate;
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return "DateSelectionDTO{" +
                "selectedDate=" + selectedDate +
                '}';
    }
public static DateSelectionDTO fromEntity(DateSelection dateSelection) {
    return new DateSelectionDTO(dateSelection.getSelectedDate());
}

public DateSelection toEntity() {
    DateSelection dateSelection = new DateSelection();
    dateSelection.setSelectedDate(this.selectedDate);
    return dateSelection;
}

}