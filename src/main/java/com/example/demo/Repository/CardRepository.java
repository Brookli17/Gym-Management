package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Mode.Card;

@Repository
public interface CardRepository extends CrudRepository<Card, Integer>{

}
