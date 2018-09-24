package se.lexicon.FlightReservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import se.lexicon.FlightReservation.data_access.FlightDao;
import se.lexicon.FlightReservation.data_access.FoodDao;
import se.lexicon.FlightReservation.data_access.PassengerDao;
import se.lexicon.FlightReservation.data_access.ReservationDao;
import se.lexicon.FlightReservation.data_access.SeatDao;
import se.lexicon.FlightReservation.entities.Flight;
import se.lexicon.FlightReservation.entities.Food;
import se.lexicon.FlightReservation.entities.Passenger;
import se.lexicon.FlightReservation.entities.Reservation;
import se.lexicon.FlightReservation.entities.Seat;



	@CrossOrigin(origins = "*")
	@RestController
	@RequestMapping("/flightreservation")
	
	public class ReservationRestController {
		
			@Autowired
			ReservationDao reservationDao;
			
			@Autowired
			PassengerDao passengerDao;
			
			@Autowired
			FlightDao flightDao;
			
			@Autowired
			SeatDao seatDao;
			
			@Autowired
			FoodDao foodDao;
			
			@GetMapping("/reservation")
			public ResponseEntity<List<Reservation>>getAllReservations() {		
				
				return ResponseEntity.status(200).body(reservationDao.findAll());
				
			}
			
			@PostMapping("/reservation")
			public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) {
				
				Passenger passenger = passengerDao.findById(reservation.getPassenger().getPassengerId());
				reservation.setPassenger(passenger);
				
				Flight flight = flightDao.findById(reservation.getFlight().getFlightNo());
				reservation.setFlight(flight);
				
				Seat seat = seatDao.findById(reservation.getSeat().getSeatId());
				seat.setIsReserved(true);
				reservation.setSeat(seat);
	
				Food food = foodDao.findById(reservation.getFood().getFoodId());
				reservation.setFood(food);
				
				reservation.setTotalCost();
				return ResponseEntity.status(201).body(reservationDao.save(reservation));
						
			}
			
			
			@GetMapping("/reservation/{id}")
			public ResponseEntity<Reservation> getReservation(@PathVariable(value="id") int id){
				
				return ResponseEntity.status(200).body(reservationDao.findById(id));
			}
			
			@GetMapping("/reservation/flightdetails")
			public ResponseEntity<List<Reservation>>getFlightDetails() {		
				
				return ResponseEntity.status(200).body(reservationDao.findAll());
			}
		}




	
	
