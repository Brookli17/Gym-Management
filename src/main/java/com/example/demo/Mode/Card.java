package com.example.demo.Mode;




import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer UserId;
	@Column
	private  String CardHolderName;
	@Column
	private  String CardNumber;
	@Column
	private  Integer Expdate;
	@Column
	private  Integer cvv;
	@Column
	private  String Plan;
	
	
	
	
	

}
