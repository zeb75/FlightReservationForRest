package se.lexicon.FlightReservation.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservationNo;
	
	private int totalCost;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "seatId")
	private Seat seat;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "foodId")
	private Food food;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passengerId")
	private Passenger passenger;
	
	@ManyToOne
	@JoinColumn(name = "flightNo")
	private Flight flight;

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost() {
		this.totalCost = seat.getPrice() + food.getPrice();

	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public int getReservationNo() {
		return reservationNo;
	}
	


	
}
