package com.memo.love.DTO;

import com.memo.love.Models.DateSelection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateSelectionDTO {

    private String selectedDate; // Ahora almacenamos la fecha como String

    // Constructor vacío (necesario para frameworks como Spring)
    public DateSelectionDTO() {
    }

    // Constructor con parámetros
    public DateSelectionDTO(String selectedDate) {
        this.selectedDate = selectedDate;
    }

    // Getters y Setters
    public String getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(String selectedDate) {
        this.selectedDate = selectedDate;
    }

    // Método para convertir de entidad a DTO
    public static DateSelectionDTO fromEntity(DateSelection dateSelection) {
        return new DateSelectionDTO(dateSelection.getSelectedDate().toString());
    }

    // Método para convertir de DTO a entidad
    public DateSelection toEntity() {
        DateSelection dateSelection = new DateSelection();
        dateSelection.setSelectedDate(LocalDate.parse(this.selectedDate, DateTimeFormatter.ISO_DATE));
        return dateSelection;
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return "DateSelectionDTO{" +
                "selectedDate='" + selectedDate + '\'' +
                '}';
    }
}