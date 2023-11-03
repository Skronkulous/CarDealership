package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    public String name, address, phone;
    public static ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

    public Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public static ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        ArrayList<Vehicle> newVehicleList = new ArrayList<Vehicle>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getPrice() >= min && vehicle.getPrice() <= max){
                newVehicleList.add(vehicle);
            }
        }
        return newVehicleList;
    }

    public static ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> newVehicleList = new ArrayList<Vehicle>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                newVehicleList.add(vehicle);
            }
        }
        return newVehicleList;
    }

    public static ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        ArrayList<Vehicle> newVehicleList = new ArrayList<Vehicle>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getYear() >= min && vehicle.getYear() <= max){
                newVehicleList.add(vehicle);
            }
        }
        return newVehicleList;
    }

    public static ArrayList<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> newVehicleList = new ArrayList<Vehicle>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getColor().equalsIgnoreCase(color)){
                newVehicleList.add(vehicle);
            }
        }
        return newVehicleList;
    }

    public static ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        ArrayList<Vehicle> newVehicleList = new ArrayList<Vehicle>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getOdometer() >= min && vehicle.getOdometer() <= max){
                newVehicleList.add(vehicle);
            }
        }
        return newVehicleList;
    }

    public static ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        ArrayList<Vehicle> newVehicleList = new ArrayList<Vehicle>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getVehicleType().equalsIgnoreCase(vehicleType)){
                newVehicleList.add(vehicle);
            }
        }
        return newVehicleList;
    }

    public static ArrayList<Vehicle> getAllVehicles(){
        ArrayList<Vehicle> newVehicleList = new ArrayList<Vehicle>();
        for(Vehicle vehicle: inventory){
            newVehicleList.add(vehicle);
        }
        return newVehicleList;
    }

    public static void addVehicle(Vehicle newVehicle){

    }

    public static void removeVehicle(Vehicle newVehicle){

    }
}
