package se.lexicon.FlightReservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import se.lexicon.FlightReservation.data_access.PassengerDao;
import se.lexicon.FlightReservation.entities.Passenger;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flightreservation")
public class PassengerRestController {

	@Autowired
	PassengerDao passengerDao;

	@GetMapping("/passenger")
	public ResponseEntity<List<Passenger>> getAllPassengers() {

		return ResponseEntity.status(200).body(passengerDao.findAll());

	}

	@GetMapping("/passenger/{id}")
	public ResponseEntity<Passenger> getPassenger(@PathVariable(value = "id") int id) {

		return ResponseEntity.status(200).body(passengerDao.findById(id));
	}
}
