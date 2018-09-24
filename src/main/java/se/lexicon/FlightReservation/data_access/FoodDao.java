package se.lexicon.FlightReservation.data_access;

import java.util.List;

import se.lexicon.FlightReservation.entities.Food;

public interface FoodDao {

	Food save(Food food);

	Food update(Food food);

	Food findById(int id);

	void deleteFood(int id);

	List<Food> findAll();

}