package com.example.HospitalManagement.service;

import com.example.HospitalManagement.model.Doctor;
import com.example.HospitalManagement.repo.IDoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    IDoctorRepo iDoctorRepo;

    public void addDoctor(List<Doctor> doctors) {
        iDoctorRepo.saveAll(doctors);
    }
}
