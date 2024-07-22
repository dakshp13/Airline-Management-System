package amsSystem;

import java.util.Scanner;
public class amsFlightBooking extends amsFirstClassSeats {


    public static void FlightBooking(amsFlightPackage FLight, long numberOfEconomySeats, long numberOfBusinessSeats, long numberOfFirstClassSeats) {
        Scanner userCommunication = new Scanner(System.in);
        System.out.println("Your Booking Process for Flight" + " " + FLight + " " + "is Starting");
        System.out.println("If you would like to cancel please press 0, otherwise press any other character on your keyboard");

        if (userCommunication.next().equalsIgnoreCase("0")) {
            System.out.println("Your Booking Process is Cancelled, You will return to the Home Screen");
        } else {
            System.out.println("For Confirmation Your Seat choices are:");
            System.out.println("Number of Economy Seats:" + " " + numberOfEconomySeats);
            System.out.println("Number of Business Seats:" + " " + numberOfBusinessSeats);
            System.out.println("Number of First Class Seats:" + " " + numberOfFirstClassSeats);

            System.out.println("If any of this information is wrong, or you want to cancel please press 0, otherwise press any other character on your keyboard");

            if (userCommunication.next().equalsIgnoreCase("0")) {
                System.out.println("If you would like to return to the Home Screen and Cancel, Please press 0 Again");
                System.out.println("If you would like to change your seat selection please press any other character on your keyboard");


                if (userCommunication.next().equalsIgnoreCase("0")) {
                    System.out.println("You will be taken to the Home Screen");
                } else {
                    System.out.println("You many now enter your new seat selection");
                    System.out.println("Please enter your new seat selection for Number of Economy Seats");
                    numberOfEconomySeats = userCommunication.nextInt();
                    System.out.println("Please enter your new seat selection for Number of BusinessSeats");
                    numberOfBusinessSeats = userCommunication.nextInt();
                    System.out.println("Please enter your new seat selection for Number of First Class Seats");
                    numberOfFirstClassSeats = userCommunication.nextInt();
                    System.out.println("Thank you for your Booking for flight" + " " + FLight);
                    System.out.println("You will now be directed to Flight Payment");

                    FLight.setAvailableEconomySeats(FLight.getAvailableEconomySeats() - numberOfEconomySeats);
                    FLight.setAvailableBusinessSeats(FLight.getAvailableBusinessSeats() - numberOfBusinessSeats);
                    FLight.setAvailableFirstClassSeats(FLight.getAvailableFirstClassSeats() - numberOfFirstClassSeats);

                    double totalEconomyPrice = FLight.getEconomyPrice() * numberOfEconomySeats;
                    double totalBusinessPrice = FLight.getBusinessPrice() * numberOfBusinessSeats;
                    double totalFirstClassPrice = FLight.getFirstClassPrice() * numberOfFirstClassSeats;

                    double totalFlightPrice = totalEconomyPrice + totalBusinessPrice + totalFirstClassPrice;

                    System.out.println("Your final Flight Price is" + " " + totalFlightPrice);
                    System.out.println("If you would like to cancel payment process and booking, press 0, Otherwise you may press any other character");

                    if (userCommunication.next().equalsIgnoreCase("0")) {
                        System.out.println("Your Payment Process and Booking are cancelled, you will now return to the Home Screen");
                    }
                    else {
                        System.out.println("Please enter your First Name");
                        String customerName = userCommunication.next();
                        System.out.println("Hello" + " " + customerName);
                        System.out.println("Please enter you Card Number");
                        System.out.println("Your Card Number is:" + " " + userCommunication.nextLong());
                        System.out.println("Enter your CVV Number here");
                        System.out.println("Your CVV Number is:" + " " + userCommunication.nextInt());
                        System.out.println("Enter Card Expiry Date here (MM/YYYY)");
                        System.out.println("Your Card Expiry Date is:" + " " + userCommunication.next());
                        System.out.println("Thank you, your flight of" + " " + FLight + " " + "Has been Purchased and Booked");
                    }
                }

            } else {
                System.out.println("Thank you for your Booking for flight" + " " + FLight);
                System.out.println("You will now be directed to Flight Payment");


                FLight.setAvailableEconomySeats(FLight.getAvailableEconomySeats() - numberOfEconomySeats);
                FLight.setAvailableBusinessSeats(FLight.getAvailableBusinessSeats() - numberOfBusinessSeats);
                FLight.setAvailableFirstClassSeats(FLight.getAvailableFirstClassSeats() - numberOfFirstClassSeats);

                double totalEconomyPrice = FLight.getEconomyPrice() * numberOfEconomySeats;
                double totalBusinessPrice = FLight.getBusinessPrice() * numberOfBusinessSeats;
                double totalFirstClassPrice = FLight.getFirstClassPrice() * numberOfFirstClassSeats;

                double totalFlightPrice = totalEconomyPrice + totalBusinessPrice + totalFirstClassPrice;

                System.out.println("Your final Flight Price is" + " " + totalFlightPrice);
                System.out.println("If you would like to cancel payment process and booking, press 0, Otherwise you may press any other character");

                     if (userCommunication.next().equalsIgnoreCase("0")) {
                    System.out.println("Your Payment Process and Booking are cancelled, you will now return to the Home Screen");
                     }
                     else {
                    System.out.println("Please enter your First Name");
                    String customerName = userCommunication.next();
                    System.out.println("Hello" + " " + customerName);
                    System.out.println("Please enter you Card Number");
                    System.out.println("Your Card Number is:" + " " + userCommunication.nextLong());
                    System.out.println("Enter your CVV Number here");
                    System.out.println("Your CVV Number is:" + " " + userCommunication.nextInt());
                    System.out.println("Enter Card Expiry Date here (MM/YYYY)");
                    System.out.println("Your Card Expiry Date is:" + " " + userCommunication.next());
                    System.out.println("Thank you, your flight of" + " " + FLight + " " + "Has been Purchased and Booked");
                    }

            }

        }

    }
}