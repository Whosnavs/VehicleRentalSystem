/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author Marco Navarro
 */
public class ElectricCar extends Vehicle {
    double battery;

    public ElectricCar(String make, String model, double price, double battery) {
        super(make, model, price);
        this.battery = battery;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery: " + battery + " kWh");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Electric car maintenance.");
    }
}
