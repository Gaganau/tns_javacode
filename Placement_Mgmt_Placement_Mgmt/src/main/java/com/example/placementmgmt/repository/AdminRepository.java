package com.example.placementmgmt.repository;

import com.example.placementmgmt.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
