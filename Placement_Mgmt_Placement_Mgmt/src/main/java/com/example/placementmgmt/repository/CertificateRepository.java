package com.example.placementmgmt.repository;

import com.example.placementmgmt.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}
