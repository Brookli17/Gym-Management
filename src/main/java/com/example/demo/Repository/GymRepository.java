package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Mode.Card;
import com.example.demo.Mode.Gym;

@Repository
public interface GymRepository  extends CrudRepository<Gym ,  Integer> {

	void save(Card newCard);

}
