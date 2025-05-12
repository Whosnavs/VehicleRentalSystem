/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author Marco Navarro
 */
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota", "Vios", 50, 4),
            new Truck("Isuzu", "D-Max", 90, 3),
            new Motorcycle("Honda", "Click", 30, true),
            new ElectricCar("Tesla", "Model 3", 120, 75)
        };

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("3-day rental: $" + v.calculateRentalCost(3));
            v.performMaintenance();
            System.out.println("---------------");
        }
    }
}

        
