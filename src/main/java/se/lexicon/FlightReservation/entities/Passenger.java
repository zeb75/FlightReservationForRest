package se.lexicon.FlightReservation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int passengerId;
private String name;
private String email;

protected Passenger() {
	
}

public Passenger(String name, String email) {
	
	this.name = name;
	this.email = email;
}

public int getPassengerId() {
	return passengerId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + passengerId;
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
	Passenger other = (Passenger) obj;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (passengerId != other.passengerId)
		return false;
	return true;
}

@Override
public String toString() {
	return "Passenger [passengerId=" + passengerId + ", name=" + name + ", email=" + email + "]";
}
}