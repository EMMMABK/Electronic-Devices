package com.example.electronicdevices;

public class Tablet extends Device {
    private double batteryLife; // in hours
    private boolean hasStylus;

    public Tablet(String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery Life: " + batteryLife + " hours, Has Stylus: " + (hasStylus ? "Yes" : "No");
    }
}