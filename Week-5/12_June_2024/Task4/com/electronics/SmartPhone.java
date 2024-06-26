package com.electronics;

public class SmartPhone extends SmartDevice {

    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    public void makeCall() {
        System.out.println("Making a call");
    }
}
