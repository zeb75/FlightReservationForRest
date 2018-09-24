package se.lexicon.FlightReservation.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import se.lexicon.FlightReservation.data_access.FoodDao;
import se.lexicon.FlightReservation.entities.Food;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flightreservation")
public class FoodRestController {

		@Autowired
		FoodDao foodDao;
		
		@GetMapping("/food")
		public ResponseEntity<List<Food>>getAllFood() {		
			
			return ResponseEntity.status(200).body(foodDao.findAll());
			
		}

		@GetMapping("/book/{id}")
		public ResponseEntity<Food> getBook(@PathVariable(value="id") int id){
			
			return ResponseEntity.status(200).body(foodDao.findById(id));
		}
	}

	

