package com.example.room;

public class Room {

    private double area;
    private double currentTemp;
    private boolean isAirConditioner;
    private final int minTemp = 18;

    public Room(double area, double currentTemp, boolean isAirConditioner) {
        this.area = area;
        this.currentTemp = currentTemp;
        this.isAirConditioner = isAirConditioner;
    }

    public boolean descendingTemp() {
        if (isAirConditioner && currentTemp > minTemp) {
            --currentTemp;
            return true;
        } else {
            currentTemp = minTemp;
            return false;
        }
    }

    public String show() {
        return "current temp: " + currentTemp + ", area: " + area + ", is air conditioner: " + isAirConditioner;
    }
}
