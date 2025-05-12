/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author Marco Navarro
 */
public class Motorcycle extends Vehicle {
    boolean helmet;

    public Motorcycle(String make, String model, double price, boolean helmet) {
        super(make, model, price);
        this.helmet = helmet;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Helmet rental: " + (helmet ? "Yes" : "No"));
    }

    @Override
    public void performMaintenance() {
        System.out.println("Motorcycle maintenance.");
    }
}

