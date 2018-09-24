package se.lexicon.FlightReservation.data_access;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import se.lexicon.FlightReservation.entities.Food;
import se.lexicon.FlightReservation.entities.Seat;

@Repository
@Transactional
public class FoodDaoImpl implements FoodDao {
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Food save(Food food) {
		em.persist(food);

		return food;

	}


	@Override
	public Food update(Food food) {
		Food mergedFood = em.merge(food);
		return mergedFood;
	}




	@Override
	public Food findById(int id) {
		Food found = em.find(Food.class, id);
		return found;
	}




	@Override
	public void deleteFood(int id) {
		Food toDelete = findById(id);
		if (toDelete != null) {
			em.remove(toDelete);
		}
	}




	@Override
	public List<Food> findAll() {
		Query query = em.createQuery("SELECT f FROM Food f");
		List<Food> allFood = query.getResultList();

		return allFood;
}
}
