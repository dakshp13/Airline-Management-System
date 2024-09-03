package amsSystem;

import java.util.List;
import java.time.LocalDate;


public class amsMAIN { // Main class for all user operations
   public static void main(String[] args) {


//Example Flights Created in the System
amsFlightPackage A1 = new amsFlightPackage(1, "Boeing 737-700", "Toronto", "12:00","Los Angeles","19:00", LocalDate.of(2024,9,15));
amsFlightPackage B1 = new amsFlightPackage(2,"Boeing 747-400","Toronto", "12:00","Miami","17:00",LocalDate.of(2024,9,15));
amsFlightPackage C1 = new amsFlightPackage(3,"Airbus A320","London", "15:00","Sydney","23:00",LocalDate.of(2024,9,24));
amsFlightPackage D1 = new amsFlightPackage(4,"Airbus A380","Tokyo", "5:00","Delhi","10:00",LocalDate.of(2024,9,26));
amsFlightPackage E1 = new amsFlightPackage(5,"ATR 72","Auckland", "16:00","Milan","23:00",LocalDate.of(2024,9,27));
amsFlightPackage F1 = new amsFlightPackage(6,"Boeing 757","Vancouver", "10:00","Miami","17:00",LocalDate.of(2024,9,29));
amsFlightPackage G1 = new amsFlightPackage(7,"Boeing 747-400","Toronto", "15:00","Boston","19:00",LocalDate.of(2024,9,29));
amsFlightPackage H1 = new amsFlightPackage(8,"ATR 72","New York", "22:00","Miami","2:00",LocalDate.of(2024,9,29));

//Add to List
amsAllFlights.addFlight(A1);
amsAllFlights.addFlight(B1);
amsAllFlights.addFlight(C1);
amsAllFlights.addFlight(D1);
amsAllFlights.addFlight(E1);
amsAllFlights.addFlight(F1);
amsAllFlights.addFlight(G1);
amsAllFlights.addFlight(H1);

//Example using Flight A1
      A1.setAvailableEconomySeats(150);
      A1.setEconomyPrice(400);
      A1.setAvailableBusinessSeats(50);
      A1.setBusinessPrice(800);
      A1.setAvailableFirstClassSeats(25);
      A1.setFirstClassPrice(1200);

      A1.createFlightCode();
      System.out.println(A1.getFlightCode());

//using FlightSearch method to find flights based on certain parameters
      List<amsFlightPackage> searchedFlights = amsFlightSearch.FlightSearch("Boeing 737-700","Toronto","12:00");
      System.out.println(searchedFlights);
//Booking flight A1 alongside the seat parameters
//economy seats = 3, business seats = 3, firstclass seats = 3
      amsFlightBooking.FlightBooking(A1, 3,2,1);


   }

}
