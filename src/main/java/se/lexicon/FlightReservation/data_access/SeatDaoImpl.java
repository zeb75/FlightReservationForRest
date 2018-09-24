package se.lexicon.FlightReservation.data_access;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import se.lexicon.FlightReservation.entities.Flight;
import se.lexicon.FlightReservation.entities.Seat;

@Repository
@Transactional
public class SeatDaoImpl implements SeatDao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Seat save(Seat seat) {
		em.persist(seat);

		return seat;

	}

	@Override
	public Seat update(Seat seat) {
		Seat mergedSeat = em.merge(seat);
		return mergedSeat;
	}



	@Override
	public Seat findById(int id) {
		Seat found = em.find(Seat.class, id);
		return found;
	}



	@Override
	public void deleteSeat(int id) {
		Seat toDelete = findById(id);
		if (toDelete != null) {
			em.remove(toDelete);
		}
	}



	@Override
	public List<Seat> findAll() {
		Query query = em.createQuery("SELECT s FROM Seat s");
		List<Seat> allSeats = query.getResultList();

		return allSeats;
}
}
