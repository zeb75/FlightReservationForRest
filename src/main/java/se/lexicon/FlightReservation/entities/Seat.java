package se.lexicon.FlightReservation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seatId;
	
	private int seatNo;
	
	private boolean reserved;

	private String category;

	private int price;
	
	protected Seat() {
		
	}

public Seat(int seatNo, boolean reserved, String category, int price) {
	
	this.seatNo = seatNo;
	this.reserved = reserved;
	this.category = category;
	this.price = price;
	
}
public int getSeatId() {
	return seatId;
}

public int getSeatNo() {
	return seatNo;
}

public void setSeatNo(int seatNo) {
	this.seatNo = seatNo;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public boolean isReserved() {
	return reserved;
}

public void setIsReserved(boolean reserved) {
	this.reserved = reserved;
}


//public Flight getFlight() {
//	return flight;
//}
//
//public void setFlight(Flight flight) {
//	this.flight = flight;
//}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((category == null) ? 0 : category.hashCode());
	result = prime * result + price;
	result = prime * result + (reserved ? 1231 : 1237);
	result = prime * result + seatId;
	result = prime * result + seatNo;
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
	Seat other = (Seat) obj;
	if (category == null) {
		if (other.category != null)
			return false;
	} else if (!category.equals(other.category))
		return false;
	if (price != other.price)
		return false;
	if (reserved != other.reserved)
		return false;
	if (seatId != other.seatId)
		return false;
	if (seatNo != other.seatNo)
		return false;
	return true;
}

@Override
public String toString() {
	return "Seat [seatId=" + seatId + ", seatNo=" + seatNo + ", reserved=" + reserved + ", category=" + category
			+ ", price=" + price + "]";
}



}
