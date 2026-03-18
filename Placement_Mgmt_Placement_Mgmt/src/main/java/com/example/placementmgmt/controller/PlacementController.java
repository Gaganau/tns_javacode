package com.example.placementmgmt.controller;

import com.example.placementmgmt.entity.Placement;
import com.example.placementmgmt.repository.PlacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/placements")
public class PlacementController {

    @Autowired
    private PlacementRepository placementRepository;

    @GetMapping
    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    @PostMapping
    public Placement createPlacement(@RequestBody Placement placement) {
        return placementRepository.save(placement);
    }

    @GetMapping("/{id}")
    public Placement getPlacementById(@PathVariable Long id) {
        return placementRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Placement updatePlacement(@PathVariable Long id, @RequestBody Placement placementDetails) {
        Placement placement = placementRepository.findById(id).orElse(null);
        if (placement != null) {
            placement.setCompany(placementDetails.getCompany());
            placement.setPosition(placementDetails.getPosition());
            placement.setSalary(placementDetails.getSalary());
            placement.setStudent(placementDetails.getStudent());
            return placementRepository.save(placement);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePlacement(@PathVariable Long id) {
        placementRepository.deleteById(id);
    }
}
