/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author Marco Navarro
 */
public class Truck extends Vehicle {
    double capacity;

    public Truck(String make, String model, double price, double capacity) {
        super(make, model, price);
        this.capacity = capacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload: " + capacity + " tons");
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = super.calculateRentalCost(days);
        if (days > 3) cost *= 0.95; // 5% discount
        return cost;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Truck maintenance.");
    }
}

