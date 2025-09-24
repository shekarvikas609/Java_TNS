package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Long> {
    // JpaRepository already provides save(), findAll(), findById(), deleteById(), existsById()
}
