package amsSystem;

public class amsBusinessSeats extends amsEconomySEATS{

    //Class and Methods for all Business Seats on the FLight
    private long availableSeats;
    private long seatCapacity;
    private double price;

    public amsBusinessSeats() {
        this.availableSeats = 0;
        this.seatCapacity = 0;
        this.price = 0.0;
    }
    public amsBusinessSeats(long availableSeats, long seatCapacity, double price){
        this.availableSeats = availableSeats;
        this.seatCapacity = seatCapacity;
        this.price = price;
    }

    public long getAvailableBusinessSeats() {
        return availableSeats;
    }

    public long getBusinessSeatCapacity() {
        return seatCapacity;
    }

    public void setAvailableBusinessSeats(long availableSeats) {
        if (availableSeats <= 0) {
            System.out.println("Invalid");
        } else {

            this.availableSeats = availableSeats;
        }
    }
    public void setBusinessSeatCapacity(long seatCapacity) {
        if (seatCapacity <= 0 || seatCapacity < availableSeats){
            System.out.println("Invalid");
        }
        this.seatCapacity = seatCapacity;
    }
    public double getBusinessPrice() {
        return price;
    }

    public void setBusinessPrice(double price) {
        if (price < 0.0) {
            System.out.println("Invalid");
        } else {
            this.price = price;
        }
    }
}

