package com.example.placementmgmt.controller;

import com.example.placementmgmt.entity.Certificate;
import com.example.placementmgmt.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certificates")
public class CertificateController {

    @Autowired
    private CertificateRepository certificateRepository;

    @GetMapping
    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    @PostMapping
    public Certificate createCertificate(@RequestBody Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @GetMapping("/{id}")
    public Certificate getCertificateById(@PathVariable Long id) {
        return certificateRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Certificate updateCertificate(@PathVariable Long id, @RequestBody Certificate certificateDetails) {
        Certificate certificate = certificateRepository.findById(id).orElse(null);
        if (certificate != null) {
            certificate.setName(certificateDetails.getName());
            certificate.setIssuer(certificateDetails.getIssuer());
            certificate.setStudent(certificateDetails.getStudent());
            return certificateRepository.save(certificate);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCertificate(@PathVariable Long id) {
        certificateRepository.deleteById(id);
    }
}
