package com.electronics;

public class SmartDevice extends ElectronicDevice {

    public SmartDevice(String brand, String model) {
        super(brand, model);
    }

    public void connectToWiFi() {
        System.out.println("Connecting to WiFi");
    }
}
