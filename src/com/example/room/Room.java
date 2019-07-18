package com.example.room;

public class Room {

    private double area;
    private double currentTemp;
    private boolean isAirConditioner;

    public Room(double area, double currentTemp, boolean isAirConditioner) {
        this.area = area;
        this.currentTemp = currentTemp;
        this.isAirConditioner = isAirConditioner;
    }

    public boolean descendingTemp() {
        if(isAirConditioner && !maxTemp()) {
            --currentTemp;
            return true;
        } else {
            return false;
        }
    }

    public boolean maxTemp() {
        return currentTemp == 18;
    }

    public String show() {
        return "current temp: " + currentTemp + ", area: " + area + ", is air conditioner: " + isAirConditioner;
    }
}
