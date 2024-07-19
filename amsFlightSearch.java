package amsSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;



public class amsFlightSearch  {

   /* private String flightModel;
    private String flightStartingLocation;
    private String departureTime;
    private String flightDestination;
    private String arrivalTime;
    private LocalDate departureDate;
    private double economyPrice;
    private double businessPrice;
    private double firstClassPrice;*/






  /* public amsFlightSearch(String flightModel, String flightStartingLocation, String departureTime, String flightDestination, String arrivalTime,
                           LocalDate departureDate, double economyPrice, double businessPrice, double firstClassPrice) {


        this.flightModel = (flightModel != null) ? flightModel : "N/A";
        this.flightStartingLocation = (flightStartingLocation != null) ? flightStartingLocation : "N/A";
        this.departureTime = (departureTime != null) ? departureTime : "N/A";
        this.flightDestination = (flightDestination != null) ? flightDestination : "N/A";
        this.arrivalTime = (arrivalTime != null) ? arrivalTime : "N/A";
        this.departureDate = (departureDate !=  null) ? departureDate : LocalDate.now();
        this.economyPrice = (economyPrice != 0) ? economyPrice : 1000000;
        this.businessPrice = (businessPrice != 0) ? businessPrice : 100000;
        this.firstClassPrice = (firstClassPrice != 0) ? firstClassPrice : 1000000;

    } */


    public static List<amsFlightPackage> FlightSearch(String flightModel, String flightStartingLocation, String departureTime, String flightDestination, String arrivalTime, LocalDate departureDate
    , double economyPrice, double businessPrice, double firstClassPrice) {


        return
                amsAllFlights.getFlights().stream().filter(flight -> flight.getFlightModel().equalsIgnoreCase(flightModel) && flight.getFlightStartingLocation().equalsIgnoreCase(flightStartingLocation)
                                && flight.getDepartureTime().equalsIgnoreCase(departureTime) && flight.getFlightDestination().equalsIgnoreCase(flightDestination)
                                && flight.getArrivalTime().equalsIgnoreCase(arrivalTime) && flight.getDepartureDate().equals(departureDate) && flight.getEconomyPrice() <= economyPrice &&
                                flight.getBusinessPrice() <= businessPrice && flight.getFirstClassPrice() <= firstClassPrice)
                        .collect(Collectors.toList());
    }

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
                                flight.getFlightStartingLocation().equalsIgnoreCase(flightStartingLocation) && flight.getDepartureTime().equalsIgnoreCase(departureTime)).
                        collect(Collectors.toList());
    }
}



