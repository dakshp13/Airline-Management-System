package amsSystem;

import java.util.Random;
public class amsFlightCode{

    //Code used to generate specific flight codes for the company

    private String flightCode;
    private static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*"; //All characters that can be used


    public amsFlightCode(){
        this.flightCode = "";
    }
    public amsFlightCode(String flightCode){
        this.flightCode = flightCode;

    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String createFlightCode(){   //Creating Flight Code randomly for each flights
        Random code = new Random();
        int codeLength = 10;
        StringBuilder code2 = new StringBuilder(codeLength);

        for(int i = 0; i < codeLength; i++){
            int randomIndex = code.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            code2.append(randomChar);

        }
        flightCode = code2.toString();
        return flightCode;

    }

}
