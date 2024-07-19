package amsSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class amsAllFlights {

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
