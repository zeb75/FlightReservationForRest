package se.lexicon.FlightReservation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import se.lexicon.FlightReservation.data_access.FlightDao;
import se.lexicon.FlightReservation.data_access.FoodDao;
import se.lexicon.FlightReservation.data_access.PassengerDao;
import se.lexicon.FlightReservation.data_access.SeatDao;
import se.lexicon.FlightReservation.entities.Flight;
import se.lexicon.FlightReservation.entities.Food;
import se.lexicon.FlightReservation.entities.Passenger;
import se.lexicon.FlightReservation.entities.Seat;
@Component
@Transactional
public class CommandLine implements CommandLineRunner {
	
	@Autowired
	FlightDao flightDao;
	
	@Autowired
	SeatDao seatDao;
	
	@Autowired
	FoodDao foodDao;
	
	@Autowired
	PassengerDao passengerDao;

	@Override
	public void run(String... args) throws Exception {
		
		Flight f1 = new Flight("2018-08-20_22:05", "Stockholm");
		Flight f2 = new Flight("2018-08-21_06:35", "London");

		
		Seat s1 = new Seat(1, false,"Economy", 5000);
		Seat s2 = new Seat(2, false,"Economy", 5000);
		Seat s3 = new Seat(3, false,"Economy", 5000);
		Seat s4 = new Seat(4, false,"Economy", 5000);
		Seat s5 = new Seat(5, false,"Economy", 5000);
		Seat s6 = new Seat(6, false,"Economy", 5000);
		Seat s7 = new Seat(7, false,"Economy", 5000);
		Seat s8 = new Seat(8, false,"Economy", 5000);
		Seat s9 = new Seat(9, false,"Economy", 5000);
		Seat s10 = new Seat(10, false,"Economy", 5000);
		Seat s11 = new Seat(11, false,"First", 20000);
		Seat s12 = new Seat(12, false,"First", 20000);
		Seat s13 = new Seat(13, false,"First", 20000);
		Seat s14 = new Seat(14, false,"First", 20000);
		Seat s15 = new Seat(15, false,"First", 20000);
		Seat s16 = new Seat(16, false,"First", 20000);
		Seat s17 = new Seat(17, false,"First", 20000);
		Seat s18 = new Seat(18, false,"First", 20000);
		Seat s19 = new Seat(19, false,"First", 20000);
		Seat s20 = new Seat(20, false,"First", 20000);
		
		Seat s21 = new Seat(1, false,"Economy", 5000);
		Seat s22 = new Seat(2, false,"Economy", 5000);
		Seat s23 = new Seat(3, false,"Economy", 5000);
		Seat s24 = new Seat(4, false,"Economy", 5000);
		Seat s25 = new Seat(5, false,"Economy", 5000);
		Seat s26 = new Seat(6, false,"Economy", 5000);
		Seat s27 = new Seat(7, false,"Economy", 5000);
		Seat s28 = new Seat(8, false,"Economy", 5000);
		Seat s29 = new Seat(9, false,"Economy", 5000);
		Seat s30 = new Seat(10, false,"Economy", 5000);
		Seat s31 = new Seat(11, false,"First", 20000);
		Seat s32 = new Seat(12, false,"First", 20000);
		Seat s33 = new Seat(13, false,"First", 20000);
		Seat s34 = new Seat(14, false,"First", 20000);
		Seat s35 = new Seat(15, false,"First", 20000);
		Seat s36 = new Seat(16, false,"First", 20000);
		Seat s37 = new Seat(17, false,"First", 20000);
		Seat s38 = new Seat(18, false,"First", 20000);
		Seat s39 = new Seat(19, false,"First", 20000);
		Seat s40 = new Seat(20, false,"First", 20000);
		
		Food fo = new Food("None", 0);
		Food fo1 = new Food("Standard", 100);
		Food fo2 = new Food("Halal", 200);
		Food fo3 = new Food("Kosher", 1000);
		Food fo4 = new Food("Vegetarian", 10); 
		
		Passenger p1 = new Passenger("Passenger1", "test@test.se");
		Passenger p2 = new Passenger("Passenger2", "test@test.no");
		Passenger p3 = new Passenger("Passenger3", "test@test.dk");
		
		f1.addSeat(s1);
		f1.addSeat(s2);
		f1.addSeat(s3);
		f1.addSeat(s4);
		f1.addSeat(s5);
		f1.addSeat(s6);
		f1.addSeat(s7);
		f1.addSeat(s8);
		f1.addSeat(s9);
		f1.addSeat(s10);
		f1.addSeat(s11);
		f1.addSeat(s12);
		f1.addSeat(s13);
		f1.addSeat(s14);
		f1.addSeat(s15);
		f1.addSeat(s16);
		f1.addSeat(s17);
		f1.addSeat(s18);
		f1.addSeat(s19);
		f1.addSeat(s20);
		
		f2.addSeat(s21);
		f2.addSeat(s22);
		f2.addSeat(s23);
		f2.addSeat(s24);
		f2.addSeat(s25);
		f2.addSeat(s26);
		f2.addSeat(s27);
		f2.addSeat(s28);
		f2.addSeat(s29);
		f2.addSeat(s30);
		f2.addSeat(s31);
		f2.addSeat(s32);
		f2.addSeat(s33);
		f2.addSeat(s34);
		f2.addSeat(s35);
		f2.addSeat(s36);
		f2.addSeat(s37);
		f2.addSeat(s38);
		f2.addSeat(s39);
		f2.addSeat(s40);
		
		
		flightDao.save(f1);
		flightDao.save(f2);
		
		seatDao.save(s1);
		seatDao.save(s2);
		seatDao.save(s3);
		seatDao.save(s4);
		seatDao.save(s5);
		seatDao.save(s6);
		seatDao.save(s7);
		seatDao.save(s8);
		seatDao.save(s9);
		seatDao.save(s10);
		seatDao.save(s11);
		seatDao.save(s12);
		seatDao.save(s13);
		seatDao.save(s14);
		seatDao.save(s15);
		seatDao.save(s16);
		seatDao.save(s17);
		seatDao.save(s18);
		seatDao.save(s19);
		
		seatDao.save(s20);
		seatDao.save(s21);
		seatDao.save(s22);
		seatDao.save(s23);
		seatDao.save(s24);
		seatDao.save(s25);
		seatDao.save(s26);
		seatDao.save(s27);
		seatDao.save(s28);
		seatDao.save(s29);
		seatDao.save(s30);
		seatDao.save(s31);
		seatDao.save(s32);
		seatDao.save(s33);
		seatDao.save(s34);
		seatDao.save(s35);
		seatDao.save(s36);
		seatDao.save(s37);
		seatDao.save(s38);
		seatDao.save(s39);
		seatDao.save(s40);

		foodDao.save(fo);
		foodDao.save(fo1);
		foodDao.save(fo2);
		foodDao.save(fo3);
		foodDao.save(fo4);
		
		passengerDao.save(p1);
		passengerDao.save(p2);
		passengerDao.save(p3);
		
		
	}

	
}
