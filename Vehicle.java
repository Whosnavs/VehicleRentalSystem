/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author Marco Navarro
 */
public class Vehicle {
    String make, model;
    double rentalPrice;

    public Vehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public void displayDetails() {
        System.out.println(make + " " + model + " - $" + rentalPrice + " per day");
    }

    public double calculateRentalCost(int days) {
        return rentalPrice * days;
    }

    public void performMaintenance() {
        System.out.println("General maintenance for vehicle.");
    }
}
