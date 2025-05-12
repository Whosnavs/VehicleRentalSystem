/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author Marco Navarro
 */
public class Car extends Vehicle {
    int doors;

    public Car(String make, String model, double price, int doors) {
        super(make, model, price);
        this.doors = doors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Doors: " + doors);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Car maintenance.");
    }
}

