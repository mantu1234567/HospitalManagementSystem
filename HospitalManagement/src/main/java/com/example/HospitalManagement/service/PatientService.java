package com.example.HospitalManagement.service;

import com.example.HospitalManagement.model.Patient;
import com.example.HospitalManagement.repo.IAppointmentRepo;
import com.example.HospitalManagement.repo.IPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    IPatientRepo iPatientRepo;

    public void addPatien(Patient patient) {
        iPatientRepo.save(patient);
    }
}
