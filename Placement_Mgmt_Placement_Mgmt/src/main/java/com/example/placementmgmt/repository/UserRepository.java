package com.example.placementmgmt.repository;

import com.example.placementmgmt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
