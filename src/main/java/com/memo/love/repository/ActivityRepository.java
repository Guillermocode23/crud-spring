package com.memo.love.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.memo.love.Models.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}