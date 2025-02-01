package com.memo.love.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.memo.love.Models.Activity;
import com.memo.love.repository.ActivityRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Permitir peticiones desde frontend
public class ActivityController {

    @Autowired
    private ActivityRepository activityRepository;

    @PostMapping("/guardar")
    public ResponseEntity<?> saveActivities(@RequestBody List<Activity> activities) {
        return ResponseEntity.ok(activityRepository.saveAll(activities));
    }

    @GetMapping("/actividades")
    public List<Activity> getActivities() {
        return activityRepository.findAll();
    }
}
