package se.lexicon.FlightReservation.data_access;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import se.lexicon.FlightReservation.entities.Passenger;
import se.lexicon.FlightReservation.entities.Reservation;

@Repository
@Transactional
public class ReservationDaoImpl implements ReservationDao {
	@PersistenceContext
	private EntityManager em;
	
	
	
	@Override
	public Reservation save(Reservation reservation) {
		em.persist(reservation);

		return reservation;

	}

	@Override
	public Reservation update(Reservation reservation) {
		Reservation mergedReservation = em.merge(reservation);
		return mergedReservation;
	}



	@Override
	public Reservation findById(int id) {
		Reservation found = em.find(Reservation.class, id);
		return found;
	}



	@Override
	public void deleteReservation(int id) {
		Reservation toDelete = findById(id);
		if (toDelete != null) {
			em.remove(toDelete);
		}
	}



	@Override
	public List<Reservation> findAll() {
		Query query = em.createQuery("SELECT r FROM Reservation r");
		List<Reservation> allReservations = query.getResultList();

		return allReservations;
}
}