package com.vehicles;

public class Truck extends Vehicle {
    private int payloadCapacity;

    public Truck(String make, String model, int payloadCapacity) {
        super(make, model);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " kg");
    }
}