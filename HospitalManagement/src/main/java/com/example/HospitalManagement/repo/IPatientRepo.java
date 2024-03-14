package com.example.HospitalManagement.repo;

import com.example.HospitalManagement.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepo extends CrudRepository<Patient,Integer> {

}
