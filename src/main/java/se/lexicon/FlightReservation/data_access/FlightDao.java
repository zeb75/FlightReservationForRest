package se.lexicon.FlightReservation.data_access;

import java.util.List;

import se.lexicon.FlightReservation.entities.Flight;

public interface FlightDao {

	Flight save(Flight flight);

	Flight update(Flight flight);

	Flight findById(int id);

	void deleteFlight(int id);

	List<Flight> findAll();

}