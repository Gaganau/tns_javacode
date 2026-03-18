package com.example.placementmgmt.repository;

import com.example.placementmgmt.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Long> {
}
