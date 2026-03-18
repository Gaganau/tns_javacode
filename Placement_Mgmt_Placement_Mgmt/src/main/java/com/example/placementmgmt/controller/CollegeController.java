package com.example.placementmgmt.controller;

import com.example.placementmgmt.entity.College;
import com.example.placementmgmt.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colleges")
public class CollegeController {

    @Autowired
    private CollegeRepository collegeRepository;

    @GetMapping
    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    @PostMapping
    public College createCollege(@RequestBody College college) {
        return collegeRepository.save(college);
    }

    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public College updateCollege(@PathVariable Long id, @RequestBody College collegeDetails) {
        College college = collegeRepository.findById(id).orElse(null);
        if (college != null) {
            college.setName(collegeDetails.getName());
            college.setAddress(collegeDetails.getAddress());
            return collegeRepository.save(college);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCollege(@PathVariable Long id) {
        collegeRepository.deleteById(id);
    }
}
