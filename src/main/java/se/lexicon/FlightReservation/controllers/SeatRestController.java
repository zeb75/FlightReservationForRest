package se.lexicon.FlightReservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import se.lexicon.FlightReservation.data_access.SeatDao;
import se.lexicon.FlightReservation.entities.Seat;


	
	@CrossOrigin(origins = "*")
	@RestController
	@RequestMapping("/flightreservation")
	public class SeatRestController {
			@Autowired
			SeatDao seatDao;
			
			@GetMapping("/seat")
			public ResponseEntity<List<Seat>>getAllSeats() {		
				
				return ResponseEntity.status(200).body(seatDao.findAll());
				
			}
			
			@GetMapping("/seat/{id}")
			public ResponseEntity<Seat> getSeat(@PathVariable(value="id") int id){
				
				return ResponseEntity.status(200).body(seatDao.findById(id));
			}
		}


