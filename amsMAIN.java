package amsSystem;
import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;


public class amsMAIN { // Main class for all user operations
   public static void main(String[] args) {



amsFlightPackage A1 = new amsFlightPackage(21, "Boeing", "Ottawa", "12:00","London","17:00", LocalDate.of(2024,6,15));
amsFlightPackage B1 = new amsFlightPackage(22,"Airbus","Toronto", "12:00","London","17:00",LocalDate.of(2024,6,15));
amsAllFlights.addFlight(A1);
amsAllFlights.addFlight(B1);
A1.setEconomyPrice(210);
A1.setBusinessPrice(510);
A1.setFirstClassPrice(1000);

       B1.setEconomyPrice(210);
       B1.setBusinessPrice(510);
       B1.setFirstClassPrice(1000);

List<amsFlightPackage> newflight = amsFlightSearch.FlightSearch("Boeing", "Toronto","12:00","London","17:00", LocalDate.of(2024,6,15),210,510,1000);
List<amsFlightPackage> newflight2 = amsFlightSearch.FlightSearch("Airbus","Ottawa");

       System.out.println(newflight2);






   }

}
