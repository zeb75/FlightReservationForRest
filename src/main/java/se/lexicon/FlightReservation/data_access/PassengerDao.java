package se.lexicon.FlightReservation.data_access;

import java.util.List;

import se.lexicon.FlightReservation.entities.Passenger;

public interface PassengerDao {

	Passenger save(Passenger passenger);

	Passenger update(Passenger passenger);

	Passenger findById(int id);

	void deletePassenger(int id);

	List<Passenger> findAll();

}