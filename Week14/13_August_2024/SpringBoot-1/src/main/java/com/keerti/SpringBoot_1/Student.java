package com.keerti.SpringBoot_1;

public class Student {
	String name;
	String email;
	String city;
	String phone;

	//Constructor
	
	public Student(String name, String email, String city, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.phone = phone;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	


	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//toString Method
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", city=" + city + ", phone=" + phone + "]";
	}
	
	
}
