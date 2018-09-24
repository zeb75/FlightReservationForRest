package se.lexicon.FlightReservation.entities;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Flight {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightNo;
	
	private String departureDate;
	
	private String destination;
	
	@OneToMany
	private List<Seat> seats = new ArrayList<>();

	@OneToMany
	private List<Food> food = new ArrayList<>();
	
	protected Flight() {
		
	}
	
	public Flight(String departureDay, String destination) {
		
		this.departureDate = departureDay;
		this.destination = destination;
		
	}
	public int getFlightNo() {
		return flightNo;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public List<Food> getFood() {
		return food;
	}

	public void setFood(List<Food> food) {
		this.food = food;
	}

	public void addSeat(Seat seat) {
		seats.add(seat);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureDate == null) ? 0 : departureDate.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNo;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((seats == null) ? 0 : seats.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (departureDate == null) {
			if (other.departureDate != null)
				return false;
		} else if (!departureDate.equals(other.departureDate))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNo != other.flightNo)
			return false;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (seats == null) {
			if (other.seats != null)
				return false;
		} else if (!seats.equals(other.seats))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", departureDate=" + departureDate + ", destination=" + destination
				+ ", seats=" + seats + ", food=" + food + "]";
	}
	
}
	