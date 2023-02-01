package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.PatientNotFoundException;
import com.example.demo.Impl.ServiceImpl;
import com.example.demo.models.Patient;

@RestController
public class PatientController {
	
	@Autowired
	private ServiceImpl patientService;
	
    
	@PostMapping("/addpatient")
	public String addPatients( @RequestBody Patient patient) {
		patientService.savePatient(patient);
		return "new patient added";
	}
	
	
	@GetMapping("/patient/{id}")
	public Patient getPatient(@PathVariable Long id) {
		
		Patient patient = patientService.getPatientById(id);
		if(patient == null) {
			throw new PatientNotFoundException("Patient doesn't exist for id - "+id);
		}
		return patient;
	}
	
	
	@GetMapping("/patients")
	public List<Patient> getAllPatient(){
		return patientService.getAllPatient();
	}
	
	
	@PutMapping("/update/{id}")
	public Patient updatePatient(@PathVariable Long id ,@RequestBody Patient patient) {
		return patientService.updatePatient(id,patient);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePatient(@PathVariable Long id ) {
		 patientService.deletePatientById(id);
		 return "Patient deleted with id : "+id;
	}
	

}
