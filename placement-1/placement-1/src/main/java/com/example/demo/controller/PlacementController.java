package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Placement;
import com.example.demo.service.PlacementService;

@RestController
@RequestMapping("/placements")
public class PlacementController {

    @Autowired
    private PlacementService service;

    // Create Placement
    @PostMapping
    public Placement addPlacement(@RequestBody Placement placement) {
        return service.addPlacement(placement);
    }

    // Get all Placements
    @GetMapping
    public List<Placement> getAllPlacements() {
        return service.getPlacements();
    }

    // Get Placement by ID
    @GetMapping("/{id}")
    public ResponseEntity<Placement> getPlacementById(@PathVariable Long id) {
        return service.getPlacementById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update Placement
    @PutMapping("/{id}")
    public ResponseEntity<Placement> updatePlacement(@PathVariable Long id, @RequestBody Placement placement) {
        if (!service.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        placement.setId(id);
        Placement updated = service.updatePlacement(placement);
        return ResponseEntity.ok(updated);
    }

    // Delete Placement
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlacement(@PathVariable Long id) {
        if (!service.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        service.deletePlacement(id);
        return ResponseEntity.noContent().build();
    }
}
