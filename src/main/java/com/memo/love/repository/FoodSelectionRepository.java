package com.memo.love.repository;

import com.memo.love.Models.FoodSelection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodSelectionRepository extends JpaRepository<FoodSelection, Long> {
}