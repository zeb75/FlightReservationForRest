package se.lexicon.FlightReservation.data_access;

import java.util.List;

import se.lexicon.FlightReservation.entities.Seat;

public interface SeatDao {

	Seat save(Seat seat);

	Seat update(Seat seat);

	Seat findById(int id);

	void deleteSeat(int id);

	List<Seat> findAll();

}