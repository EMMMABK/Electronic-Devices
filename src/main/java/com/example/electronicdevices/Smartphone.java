package com.example.electronicdevices;

public class Smartphone extends Device {
    private double screenSize;
    private double cameraResolution;

    public Smartphone(String name, double price, double weight, double screenSize, double cameraResolution) {
        super(name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + ", Screen Size: " + screenSize + " inches, Camera Resolution: " + cameraResolution + " MP";
    }
}