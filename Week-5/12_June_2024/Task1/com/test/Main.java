package com.test;

import com.vehicles.Truck;

import com.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 4);
        Truck truck = new Truck("Ford", "F-150", 1000);

        car.displayDetails();
        truck.displayDetails();
    }
}