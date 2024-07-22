package amsSystem;

public class amsEconomySEATS extends amsFlightCode{

    //Class and Methods for all Economy Seats on the Flight

    private long availableSeats;
    private long seatCapacity;
    private double price;

    public amsEconomySEATS() {
        this.availableSeats = 0;
        this.seatCapacity = 0;
        this.price = 0.0;
    }
    public amsEconomySEATS(long availableSeats, long seatCapacity, double price){
        this.availableSeats = availableSeats;
        this.seatCapacity = seatCapacity;
        this.price = price;
    }

    public long getAvailableEconomySeats() {
        return availableSeats;
    }

    public long getEconomySeatCapacity() {
        return seatCapacity;
    }

    public void setAvailableEconomySeats(long availableSeats) {
        if (availableSeats <= 0) {
            System.out.println("Invalid");
        } else {

            this.availableSeats = availableSeats;
        }
    }
    public void setEconomySeatCapacity(long seatCapacity) {
        if (seatCapacity <= 0 || seatCapacity < availableSeats){
            System.out.println("Invalid");
        }
        this.seatCapacity = seatCapacity;
    }

    public double getEconomyPrice() {
        return price;
    }

    public void setEconomyPrice(double price) {
        if (price < 0.0) {
            System.out.println("Invalid");
        } else {
            this.price = price;
        }
    }
}
