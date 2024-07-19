package amsSystem;

public class amsFirstClassSeats extends amsBusinessSeats{
    private long availableSeats;
    private long seatCapacity;
    private double price;

    public amsFirstClassSeats() {
        this.availableSeats = 0;
        this.seatCapacity = 0;
        this.price = 0.0;
    }
    public amsFirstClassSeats(long availableSeats, long seatCapacity, double price){
        this.availableSeats = availableSeats;
        this.seatCapacity = seatCapacity;
        this.price = price;
    }

    public long getAvailableFirstClassSeats() {
        return availableSeats;
    }

    public long getFirstClassSeatCapacity() {
        return seatCapacity;
    }

    public void setAvailableFirstClassSeats(long availableSeats) {
        if (availableSeats <= 0) {
            System.out.println("Invalid");
        } else {

            this.availableSeats = availableSeats;
        }
    }
    public void setFirstClassSeatCapacity(long seatCapacity) {
        if (seatCapacity <= 0 || seatCapacity < availableSeats){
            System.out.println("Invalid");
        }
        this.seatCapacity = seatCapacity;
    }
    public double getFirstClassPrice() {
        return price;
    }

    public void setFirstClassPrice(double price) {
        if (price < 0.0) {
            System.out.println("Invalid");
        } else {
            this.price = price;
        }
    }
}

