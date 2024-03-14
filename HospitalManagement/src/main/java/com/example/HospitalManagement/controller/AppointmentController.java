package com.example.HospitalManagement.controller;

import com.example.HospitalManagement.model.Appointment;
import com.example.HospitalManagement.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;
    @PostMapping("add/appointment")
    public void addAppoint(@RequestBody List<Appointment> appointments){
        appointmentService.addAppoint(appointments);
    }
    @GetMapping("get/appoint")
    public Iterable<Appointment> get(){
        return appointmentService.get();
    }
}
