package com.example.HospitalManagement.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,scope = Appointment.class,property = "appointmentID")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentID;
    private String appointmentDescription;
    private LocalDateTime appointmentScheduleTime;
    private LocalDateTime appointmentCreationTime;
    @OneToOne
    @JoinColumn(name = "fk_patientId")
    Patient patient;


    @ManyToOne
    @JoinColumn(name = "fk_doctorId")
    Doctor doctor;
}