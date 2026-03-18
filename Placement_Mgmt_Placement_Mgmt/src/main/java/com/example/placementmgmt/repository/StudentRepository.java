package com.example.placementmgmt.repository;

import com.example.placementmgmt.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
