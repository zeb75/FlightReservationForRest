package se.lexicon.FlightReservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import se.lexicon.FlightReservation.data_access.FlightDao;
import se.lexicon.FlightReservation.entities.Flight;


	@CrossOrigin(origins = "*")
	@RestController
	@RequestMapping("/flightreservation")
	public class FlightRestController {
		
			@Autowired
			FlightDao flightDao;
			
			@GetMapping("/flight")
			public ResponseEntity<List<Flight>>getAllFlights() {		
				
				return ResponseEntity.status(200).body(flightDao.findAll());
				
			}
			
			@GetMapping("/flight/{id}")
			public ResponseEntity<Flight> getFlight(@PathVariable(value="id") int id){
				
				return ResponseEntity.status(200).body(flightDao.findById(id));
			}
		}




	

