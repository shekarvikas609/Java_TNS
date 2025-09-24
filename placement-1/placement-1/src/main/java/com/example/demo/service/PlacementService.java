package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Placement;
import com.example.demo.repository.PlacementRepository;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository repo;

    // Add Placement
    public Placement addPlacement(Placement placement) {
        return repo.save(placement);
    }

    // Get all Placements
    public List<Placement> getPlacements() {
        return repo.findAll();
    }

    // Get Placement by ID
    public Optional<Placement> getPlacementById(Long id) {
        return repo.findById(id);
    }

    // Update Placement
    public Placement updatePlacement(Placement placement) {
        return repo.save(placement);
    }

    // Delete Placement
    public void deletePlacement(Long id) {
        repo.deleteById(id);
    }

    // Check if Placement exists
    public boolean existsById(Long id) {
        return repo.existsById(id);
    }
}
