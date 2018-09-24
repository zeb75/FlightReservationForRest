package se.lexicon.FlightReservation.data_access;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import se.lexicon.FlightReservation.entities.Passenger;

@Repository
@Transactional
public class PassengerDaoImpl implements PassengerDao {
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Passenger save(Passenger passenger) {
		em.persist(passenger);

		return passenger;

	}
	@Override
	public Passenger update(Passenger passenger) {
	Passenger mergedPassenger = em.merge(passenger);
		return mergedPassenger;
	}


	@Override
	public Passenger findById(int id) {
		Passenger found = em.find(Passenger.class, id);
		return found;
	}


	@Override
	public void deletePassenger(int id) {
		Passenger toDelete = findById(id);
		if (toDelete != null) {
			em.remove(toDelete);
		}
	}


	@Override
	public List<Passenger> findAll() {
		Query query = em.createQuery("SELECT p FROM Passenger p");
		List<Passenger> allPassengers = query.getResultList();

		return allPassengers;
}
}