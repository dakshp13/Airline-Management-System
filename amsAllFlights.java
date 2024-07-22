package amsSystem;


import java.util.ArrayList;
import java.util.List;

public class amsAllFlights extends amsFlightCode{

    //Class and Methods used for adding and removing flights from amsFlightPackage class to a Java List
    private static List<amsFlightPackage> AllFlights = new ArrayList<>();

    public static void addFlight(amsFlightPackage flight) {
       AllFlights.add(flight);
    }


    public static List<amsFlightPackage> getFlights() {
        return new ArrayList<>(AllFlights);
    }

    public static void removeFlight(amsFlightPackage flight) {
        AllFlights.remove(flight);
    }




}
