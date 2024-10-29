package com.example.electronicdevices;

public abstract class Device {
    protected String name;
    protected double price;
    protected double weight;

    public Device(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Device: " + name + ", Price: $" + price + ", Weight: " + weight + "g";
    }
}