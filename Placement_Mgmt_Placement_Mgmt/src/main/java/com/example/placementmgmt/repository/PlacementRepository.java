package com.example.placementmgmt.repository;

import com.example.placementmgmt.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacementRepository extends JpaRepository<Placement, Long> {
}
