package com.example.HospitalManagement.service;

import com.example.HospitalManagement.model.Appointment;
import com.example.HospitalManagement.repo.IAppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    IAppointmentRepo iAppointmentRepo;

    public void addAppoint(List<Appointment> appointments) {
        iAppointmentRepo.saveAll(appointments);
    }

    public Iterable<Appointment> get() {
         return iAppointmentRepo.findAll();

    }
}
