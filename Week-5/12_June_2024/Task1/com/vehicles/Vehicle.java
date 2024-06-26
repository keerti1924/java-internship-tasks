package com.vehicles;
public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}