package com.example.demo.models;

import java.time.LocalDate;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Patients_Table")
public class Patient {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.AUTO
			)
	
	private Long id;
	
	private String FirstName;
	private String LastName;
	private String gender;
	private String dateOfBirth;
	private String address1;
	private String address2;
	private String phoneNo1;
	private String PhoneNo2;
	
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", address1=" + address1 + ", address2=" + address2 + ", phoneNo1="
				+ phoneNo1 + ", PhoneNo2=" + PhoneNo2 + "]";
	}


	public Patient(Long id, String firstName, String lastName, String gender, String dateOfBirth, String address1,
			String address2, String phoneNo1, String phoneNo2) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address1 = address1;
		this.address2 = address2;
		this.phoneNo1 = phoneNo1;
		PhoneNo2 = phoneNo2;
	}


	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getPhoneNo1() {
		return phoneNo1;
	}


	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}


	public String getPhoneNo2() {
		return PhoneNo2;
	}


	public void setPhoneNo2(String phoneNo2) {
		PhoneNo2 = phoneNo2;
	}
	
	
	
	

}
