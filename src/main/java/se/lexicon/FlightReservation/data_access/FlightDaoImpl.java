package se.lexicon.FlightReservation.data_access;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import se.lexicon.FlightReservation.entities.Flight;
import se.lexicon.FlightReservation.entities.Passenger;

@Repository
@Transactional
public class FlightDaoImpl implements FlightDao {

	@PersistenceContext
	private EntityManager em;
	

	@Override
	public Flight save(Flight flight) {
		em.persist(flight);

		return flight;

	}

	@Override
	public Flight update(Flight flight) {
	Flight mergedFlight = em.merge(flight);
		return mergedFlight;
	}



	@Override
	public Flight findById(int id) {
		Flight found = em.find(Flight.class, id);
		return found;
	}



	@Override
	public void deleteFlight(int id) {
		Flight toDelete = findById(id);
		if (toDelete != null) {
			em.remove(toDelete);
		}
	}



	@Override
	public List<Flight> findAll() {
		Query query = em.createQuery("SELECT f FROM Flight f");
		List<Flight> allFlights = query.getResultList();

		return allFlights;
}
}
