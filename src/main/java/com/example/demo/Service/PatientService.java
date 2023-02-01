package com.example.demo.Service;

import java.util.List;

import com.example.demo.models.Patient;

public interface PatientService {
	//get all
	 List<Patient> getAllPatient();
	
	//get by id
	Patient getPatientById(Long id);
	
	//create patient instances
	Patient savePatient(Patient patient);
	
	//update existing patient
	Patient updatePatient( Long id,Patient patient);
	
	//delete existing  patient
	void deletePatientById(Long id);
	
	

}
