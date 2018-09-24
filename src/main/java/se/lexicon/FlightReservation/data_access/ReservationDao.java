package se.lexicon.FlightReservation.data_access;

import java.util.List;

import se.lexicon.FlightReservation.entities.Reservation;

public interface ReservationDao {

	Reservation save(Reservation reservation);

	Reservation update(Reservation reservation);

	Reservation findById(int id);

	void deleteReservation(int id);

	List<Reservation> findAll();

}