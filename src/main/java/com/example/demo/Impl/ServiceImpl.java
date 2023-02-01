package com.example.demo.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service.PatientService;
import com.example.demo.models.Patient;
import com.example.demo.repository.PatientRepository;

@Service
public class ServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepo;
 
	@Override
	public List<Patient> getAllPatient() {
		return patientRepo.findAll(); 
		
	}

	
	@Override
	public Patient getPatientById(Long id) {
	 return patientRepo.findById(id).orElse(null);	
	}

	@Override
	public Patient savePatient(Patient patient) {
		return patientRepo.save(patient);
	}

	@Override
	public Patient updatePatient(Long id,Patient patient) {
		Optional<Patient> existing = patientRepo.findById(id);
		Patient existingPatient = existing.get();
		existingPatient.setFirstName(patient.getFirstName());
		existingPatient.setLastName(patient.getLastName());
		existingPatient.setGender(patient.getGender());
		existingPatient.setDateOfBirth(patient.getDateOfBirth());
		existingPatient.setAddress1(patient.getAddress1());
		existingPatient.setAddress2(patient.getAddress2());
		existingPatient.setPhoneNo1(patient.getPhoneNo1());
		existingPatient.setPhoneNo2(patient.getPhoneNo2());
			return patientRepo.save(existingPatient);
				

	    
	}

	@Override
	public void deletePatientById(Long id) {
		patientRepo.deleteById(id);
		
	}
	
	
	
	
	

}
