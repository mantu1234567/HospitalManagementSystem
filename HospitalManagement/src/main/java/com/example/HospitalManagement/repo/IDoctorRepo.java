package com.example.HospitalManagement.repo;

import com.example.HospitalManagement.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface IDoctorRepo extends CrudRepository<Doctor,Integer> {
}
