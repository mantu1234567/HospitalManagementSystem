package com.example.HospitalManagement.model;

import com.example.HospitalManagement.model.Enum.Qualification;
import com.example.HospitalManagement.model.Enum.Specialization;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,scope = Doctor.Doctor.class,property = "doctorID")
public class Doctor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer doctorID;
        private String doctorName;
        @Enumerated(EnumType.STRING)
        private Specialization specialization;
        @Pattern(regexp = "\\d{10}")
        private String doctorContactNumber;
        @Enumerated(EnumType.STRING)
        private Qualification qualification;
        @Min(value = 200)
        @Max(value = 2000)
        private Double doctorConsultationFee;
}
