package com.example.demo.Service;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Mode.Card;
import com.example.demo.Mode.Gym;
import com.example.demo.Repository.CardRepository;
import com.example.demo.Repository.GymRepository;

@Service
public class GymService {
	
	Map<Integer, Gym> FedexMap;
	AtomicInteger atomic;
	
	@Autowired
	private GymRepository gymrrpository;
	
	@Autowired
	private CardRepository cardreposiotory;
	
	public Iterable<Gym>getAllCustoemr(){
		return this.gymrrpository.findAll();
	}
	
	public Iterable<Card> getAllCustoemrCardInfo(){
		return this.cardreposiotory.findAll();
	}
	
	public void addCustomer(Gym  NewUsers) {
		this.gymrrpository.save(NewUsers);
		
	}
	
	public void addCard(Card  NewCard) {
		this.cardreposiotory.save(NewCard);
		
	}
	public void deleteCustomer(Integer CustomerId) {
		this.gymrrpository.deleteById(CustomerId);
	}
	
	public Gym getCustomerById(Integer CustomerId) {
		  return this.gymrrpository.findById(CustomerId).get();
	}
	
	public void updateCustomer(Integer CustomerId, Gym NewUsers) {
		NewUsers.setCustomerId(CustomerId);
		this.gymrrpository.save(NewUsers);
		
	}
	
	
	

}
