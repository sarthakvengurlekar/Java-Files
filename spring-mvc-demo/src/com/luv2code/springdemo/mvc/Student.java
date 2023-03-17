package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	@CourseCode
	private String courseCode;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");
		countryOptions.put("CH", "Chile");
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	

}
