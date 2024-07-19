package amsSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class amsFlightPackage extends amsFirstClassSeats{ // Class for flight and plane systems of the airline

    // All important data needed for each flight
    private long flightNumber;
    private String flightModel;
    private String flightStartingLocation;
    private String departureTime;
    private String flightDestination;
    private String arrivalTime;
    private LocalDate departureDate;


    // Primary Constructor for every Flight
    public amsFlightPackage() {
        this.flightNumber = 0;
        this.flightModel = "";
        this.flightStartingLocation = "";
        this.departureTime = "";
        this.flightDestination = "";
        this.arrivalTime = "";
        this.departureDate = LocalDate.now();

    }


    public amsFlightPackage(long flightNumber, String flightModel, String flightStartingLocation, String departureTime, String flightDestination, String arrivalTime, LocalDate departureDate) {
        this.flightNumber = flightNumber;
        this.flightModel = flightModel;
        this.flightStartingLocation = flightStartingLocation;
        this.departureTime = departureTime;
        this.flightDestination = flightDestination;
        this.arrivalTime = arrivalTime;
        this.departureDate = departureDate;


    }

    // All Accessors Methods(Getters) and Mutator Methods(Setters)
    public long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(long flightNumber) {
        if (flightNumber <= 0) {
            System.out.println("Invalid Flight Number, Please Try Again");
        } else {
            this.flightNumber = flightNumber;
        }
    }
    public String getFlightModel() {
        return flightModel;
    }

    public void setFlightModel(String flightModel) {
        this.flightModel = flightModel;
    }

    public String getFlightStartingLocation() {
        return flightStartingLocation;
    }

    public void setFlightStartingLocation(String flightStartingLocation) {
        this.flightStartingLocation = flightStartingLocation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    @Override
    public String toString() {
        return "{" + "flightNumber=" + flightNumber + ", flightModel='" + flightModel + '\'' +
                ", flightStartingLocation='" + flightStartingLocation + '\'' +
                ", flightDestination='" + flightDestination + '\'' + ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' + "departureDate=" + departureDate + '}';
    }


}


