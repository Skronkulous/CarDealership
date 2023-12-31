package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

import static com.pluralsight.WorkshopApp.*;
import static com.pluralsight.Dealership.*;
import static com.pluralsight.DealershipFileManager.*;

public class UserInterface {
    public static Scanner input = new Scanner(System.in);
    public static void display(){
        System.out.print("Welcome to E & S Used Cars! \nPlease enter a menu option (1 - 10):\n\t1)Sort Cars by Price\n\t2)Sort Cars by Make & Model\n\t3)Sort Cars by Year\n\t4)Sort Cars by Color\n\t5)Sort Cars by Mileage\n\t6)Sort Cars by Vehicle Type\n\t7)Retrieve All Available Vehicles\n\t8)Add a Vehicle to Dealership\n\t9)Remove a Vehicle from Dealership\n\t10)Quit App\nUser Input: ");
        String userInput = input.nextLine();
        if(userInput.isEmpty()){
            userInput = input.nextLine();
        }
        switch (userInput){
            case "1":
                processGetVehiclesByPriceRequest();
                break;
            case "2":
                processGetVehiclesByMakeModelRequest();
                break;
            case "3":
                processGetVehiclesByYearRequest();
                break;
            case "4":
                processGetVehiclesByColorRequest();
                break;
            case "5":
                processGetVehiclesByMileageRequest();
                break;
            case "6":
                processGetVehiclesByTypeRequest();
                break;
            case "7":
                processGetAllVehiclesRequest();
                break;
            case "8":
                processAddVehicleRequest();
                break;
            case "9":
                processRemoveVehicleRequest();
                break;
            case "10":
                System.out.println("\nThank you, see you again soon! ");
                break;
            default:
                System.out.println("\nPlease enter a valid option (1-10).\n");
                display();
                break;
        }
    }

    public static void initialize(){
        newDealership = getDealership();
    }

    public static void processGetVehiclesByPriceRequest(){
        try{
            System.out.print("\nPlease enter the minimum price for your search: $");
            double minPrice = input.nextDouble();
            System.out.print("\nPlease enter the maximum price for your search: $");
            double maxPrice = input.nextDouble();
            System.out.println("\nList of All Vehicles between $" + minPrice + " - $" + maxPrice + ":");
            displayVehicles(getVehiclesByPrice(minPrice, maxPrice));
            System.out.println("\nReturning to the main menu...\n");
            display();
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid price (Ex: $1633.23).\n");
            processGetVehiclesByPriceRequest();
        }
    }

    public static void processGetVehiclesByMakeModelRequest(){
        try{
            System.out.print("\nPlease enter the vehicle make for your search: ");
            String make = input.nextLine();
            System.out.print("\nPlease enter the vehicle model for your search: ");
            String model = input.nextLine();
            System.out.println("\nList of All " + make + " " + model + "s:");
            displayVehicles(getVehiclesByMakeModel(make, model));
            System.out.println("\nReturning to the main menu...\n");
            display();
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid make or model (Ex: Ford Explorer).\n");
            processGetVehiclesByMakeModelRequest();
        }
    }

    public static void processGetVehiclesByYearRequest(){
        try{
            System.out.print("\nPlease enter the minimum year for your search: ");
            int minYear = input.nextInt();
            System.out.print("\nPlease enter the maximum year for your search: ");
            int maxYear = input.nextInt();
            System.out.println("\nList of All Vehicles between " + minYear + " - " + maxYear + ":");
            displayVehicles(getVehiclesByYear(minYear, maxYear));
            System.out.println("\nReturning to the main menu...\n");
            display();
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid year (Ex: 2004).\n");
            processGetVehiclesByYearRequest();
        }
    }

    public static void processGetVehiclesByColorRequest(){
        try{
            System.out.print("\nPlease enter the vehicle color for your search: ");
            String color = input.nextLine();
            System.out.println("\nList of All " + color + " vehicles:");
            displayVehicles(getVehiclesByColor(color));
            System.out.println("\nReturning to the main menu...\n");
            display();
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid color (Ex: Red).\n");
            processGetVehiclesByColorRequest();
        }
    }

    public static void processGetVehiclesByMileageRequest(){
        try{
            System.out.print("\nPlease enter the minimum mileage for your search: ");
            int minMileage = input.nextInt();
            System.out.print("\nPlease enter the maximum mileage for your search: ");
            int maxMileage = input.nextInt();
            System.out.println("\nList of All Vehicles with mileage between " + minMileage + " - " + maxMileage + ":");
            displayVehicles(getVehiclesByMileage(minMileage, maxMileage));
            System.out.println("\nReturning to the main menu...\n");
            display();
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid mileage (Ex: 56263).\n");
            processGetVehiclesByMileageRequest();
        }
    }

    public static void processGetVehiclesByTypeRequest(){
        try{
            System.out.print("\nPlease enter the vehicle type for your search: ");
            String vehicleType = input.nextLine();
            System.out.println("\nList of All " + vehicleType + " vehicles:");
            displayVehicles(getVehiclesByType(vehicleType));
            System.out.println("\nReturning to the main menu...\n");
            display();
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid vehicle type (Ex: SUV).\n");
            processGetVehiclesByTypeRequest();
        }
    }

    public static void processGetAllVehiclesRequest(){
        System.out.println("\nList of All Vehicles: ");
        displayVehicles(getAllVehicles());
        System.out.println("\nReturning to the main menu...\n");
        display();
    }

    public static void processAddVehicleRequest(){
        try{
            System.out.println("\nVehicle Addition Form:");
            System.out.print("Please enter the VIM of the new vehicle(Ex: 12345): ");
            int newVim = input.nextInt();
            System.out.print("\nPlease enter the year of the new vehicle(Ex: 2003): ");
            int newYear = input.nextInt();
            System.out.print("\nPlease enter the make of the new vehicle(Ex: Ford): ");
            input.nextLine();
            String newMake = input.nextLine();
            System.out.print("\nPlease enter the model of the new vehicle(Ex: Explorer): ");
            String newModel = input.nextLine();
            System.out.print("\nPlease enter the vehicle type of the new vehicle(Ex: SUV): ");
            String newVehicleType = input.nextLine();
            System.out.print("\nPlease enter the color of the new vehicle(Ex: Red): ");
            String newColor = input.nextLine();
            System.out.print("\nPlease enter the mileage of the new vehicle(Ex: 123456): ");
            int newOdometer = input.nextInt();
            System.out.print("\nPlease enter the price of the new vehicle(Ex: $10000): $");
            double newPrice = input.nextDouble();
            Vehicle newVehicle = new Vehicle(newVim, newYear, newMake, newModel, newVehicleType, newColor, newOdometer, newPrice);
            addVehicle(newVehicle);
            System.out.println("\nYour new vehicle has been successfully added!\n\nReturning to main menu...\n");
            display();

        }
        catch (Exception inputError){
            System.out.println("\nThere has been an input error. Please review your information and try again. ");
            display();
        }
    }

    public static void processRemoveVehicleRequest(){
        try{
            System.out.println("\nAll removable vehicles: ");
            displayVehicles(inventory);
            System.out.print("\nPlease enter the number of the vehicle you would like to remove (Ex: 2): ");
            int removeInput = input.nextInt();
            inventory.remove(removeInput-1);
            saveDealership();
            System.out.println("\nYour new vehicle has been successfully removed!\n\nReturning to main menu...\n");
            display();
        }
        catch (Exception inputError){
            System.out.println("\nThere has been an input error. Please review your chosen vehicle number and try again. ");
            display();
        }
    }

    public static void displayVehicles(ArrayList<Vehicle> vehicleList){
        int temp = 1;
        for(Vehicle vehicle: vehicleList){
            System.out.println(temp + ") VIN: " + vehicle.getVin() + " | Year: " + vehicle.getYear() + " | Make: " + vehicle.getMake() + " | Model: " + vehicle.getModel() + " | Vehicle Type: " + vehicle.getVehicleType() + " | Color: " + vehicle.getColor() + " | Odometer: " + vehicle.getOdometer() + " | Price: " + vehicle.getPrice() + " |");
            temp++;
        }
    }
}
