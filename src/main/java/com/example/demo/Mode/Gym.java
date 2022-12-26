package com.example.demo.Mode;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="NewUsers")
public class Gym {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer CustomerId;
	@Column
	private  String CustomerName;
	@Column
	private  String CustomerEmail;
	@Column
	private  Integer CustomerContactNo;
	@Column
	private  String Country;
	@Column
	private String state;
	@Column
	private  String City;
	@Column
	private  Integer Zipcode;
	@Column
	private  Date DateAdded;
	@Column
	private  String Actions;
	
	
	


	
}

