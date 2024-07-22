package amsSystem;


import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;



public class amsFlightSearch  {

    /*Methods for Flight Searching for users, and overloading the FlightSearch with many different search parameter choices and using Java Streams to get
    correct flight choices*/


    public static List<amsFlightPackage> FlightSearch(String flightModel){
        return
                amsAllFlights.getFlights().stream().filter(flight -> flight.getFlightModel().equalsIgnoreCase(flightModel)).
                        collect(Collectors.toList());
    }
    public static List<amsFlightPackage> FlightSearch(String flightModel, String flightStartingLocation) {
        return
                amsAllFlights.getFlights().stream().filter(flight -> flight.getFlightModel().equalsIgnoreCase(flightModel)&&
                                flight.getFlightStartingLocation().equalsIgnoreCase(flightStartingLocation)).
                        collect(Collectors.toList());
    }
    public static List<amsFlightPackage> FlightSearch(String flightModel, String flightStartingLocation, String departureTime) {
        return
                amsAllFlights.getFlights().stream().filter(flight -> flight.getFlightModel().equalsIgnoreCase(flightModel)&&
                                flight.getFlightStartingLocation().equalsIgnoreCase(flightStartingLocation) &&
                                flight.getDepartureTime().equalsIgnoreCase(departureTime)).
                        collect(Collectors.toList());
    }
    public static List<amsFlightPackage> FlightSearch(String flightModel, String flightStartingLocation, String departureTime, String flightDestination){

        return
                amsAllFlights.getFlights().stream().filter(flight -> flight.getFlightModel().equalsIgnoreCase(flightModel) &&
                                flight.getFlightStartingLocation().equalsIgnoreCase(flightStartingLocation)
                                && flight.getDepartureTime().equalsIgnoreCase(departureTime) &&
                                flight.getFlightDestination().equalsIgnoreCase(flightDestination))
                        .collect(Collectors.toList());
    }

    public static List<amsFlightPackage> FlightSearch(String flightModel, String flightStartingLocation, String departureTime, String flightDestination, String arrivalTime) {

        return
                amsAllFlights.getFlights().stream().filter(flight -> flight.getFlightModel().equalsIgnoreCase(flightModel) &&
                                flight.getFlightStartingLocation().equalsIgnoreCase(flightStartingLocation)
                                && flight.getDepartureTime().equalsIgnoreCase(departureTime) && flight.getFlightDestination().equalsIgnoreCase(flightDestination)
                                && flight.getArrivalTime().equalsIgnoreCase(arrivalTime) )
                        .collect(Collectors.toList());
    }
    public static List<amsFlightPackage> FlightSearch(String flightModel, String flightStartingLocation, String departureTime, String flightDestination, String arrivalTime, LocalDate departureDate) {

        return
                amsAllFlights.getFlights().stream().filter(flight -> flight.getFlightModel().equalsIgnoreCase(flightModel) &&
                                flight.getFlightStartingLocation().equalsIgnoreCase(flightStartingLocation)
                                && flight.getDepartureTime().equalsIgnoreCase(departureTime) && flight.getFlightDestination().equalsIgnoreCase(flightDestination)
                                && flight.getArrivalTime().equalsIgnoreCase(arrivalTime) && flight.getDepartureDate().equals(departureDate))
                        .collect(Collectors.toList());
    }


    public static List<amsFlightPackage> FlightSearch(String flightModel, String flightStartingLocation, String departureTime, String flightDestination, String arrivalTime, LocalDate departureDate, double economyPrice, double businessPrice, double firstClassPrice) {

        return
                amsAllFlights.getFlights().stream().filter(flight -> flight.getFlightModel().equalsIgnoreCase(flightModel) &&
                                flight.getFlightStartingLocation().equalsIgnoreCase(flightStartingLocation)
                                && flight.getDepartureTime().equalsIgnoreCase(departureTime) && flight.getFlightDestination().equalsIgnoreCase(flightDestination)
                                && flight.getArrivalTime().equalsIgnoreCase(arrivalTime) && flight.getDepartureDate().equals(departureDate)
                                && flight.getEconomyPrice() <= economyPrice &&
                                flight.getBusinessPrice() <= businessPrice && flight.getFirstClassPrice() <= firstClassPrice)
                        .collect(Collectors.toList());
    }
    //Many more methods with different parameters can be made


}



