package com.memo.love.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DessertSelection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dessertItem; // Nombre del postre seleccionado

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDessertItem() {
        return dessertItem;
    }

    public void setDessertItem(String dessertItem) {
        this.dessertItem = dessertItem;
    }
}