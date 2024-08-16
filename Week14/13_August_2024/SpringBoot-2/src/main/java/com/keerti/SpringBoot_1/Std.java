package com.keerti.SpringBoot_1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Std {
	
	@Id
	Long id;
	
	@Column
	String name;
	
	@Column
	String email;
	
	@Column
	String phone;
	
	@Column
	String city;
	
}
