# E & S Used Cars Dealership System

## **Created by: Erik Holden and Sing Tuttanon**

## Table of Contents:

- [Project Description](#project-description)
- [Project Structure](#project-structure)
  - [Vehicle](#vehicle)
  - [Dealership](#dealership)
  - [DealershipFileManager](#dealershipfilemanager)
  - [UserInterface](#userinterface)
  - [WorkshopApp](#workshopapp-main)
- [Functionality](#funcionality)



## Project Description

In this Exercise, we utilized collaborative efforts in constructing an application geared toward managing a dealership's data efficiently.

## Project Structure

### **Java Classes:**

#### Vehicle
- Represents specific data of vehicles within the inventory.
  - Contains properties related to a specific vehicle.
  - Getters and Setters for vehicle properties.

#### Dealership
- Represents dealership's information.
  - Manages dealership information (Name, Address,... etc.).
  - Manages vehicle data.
    - Search function (Search by Vehicle... Price, Make and Model, Year, Color, Mileage, and Type)
    - Adding and Removing vehicle data.
    - Retrieving vehicle data

#### DealershipFileManager
- Manages reading and writing dealership-related data.
  - Loads and Saves dealership and vehicle data "to" and "from" the csv file. 

#### UserInterface
- Manages user interactions and vehicle data display.
  - Processes user input(s).
  - Moderates the flow of the application based on user input(s).

#### WorkshopApp (Main)
- Entry point of the application. 
- Initializes the application, pulling from the "UserInterface".

## Functionality

The following functions encompass accessing and managing the dealership's data system, in the perspective of an employee /or manager.

1. **Search vehicles by Price Range** -Find vehicles available within a specified price range.

// In progress: Demo samples...

2. **Search vehicles by Make and Model** - Find vehicles based on their make and model.

// In progress: Demo samples...

3. **Search vehicles by Year Range** - Find vehicles within a specified year range.

// In progress: Demo samples...

4. **Search vehicles by Color** - Find vehicles based on the specified color.

// In progress: Demo samples...

5. **Search vehicles by Mileage Range** - Find vehicles within a specified mileage range.

// In progress: Demo samples...

6. **Search vehicles by Type** - Find vehicles based on their type.

// In progress: Demo samples...

7. **Display all vehicle listings** - Display a list of all vehicles registered.

// In progress: Demo samples...

8. **Vehicle Addition** - Add a new vehicle to the dealership data system.

// In progress: Demo samples...

9. **Vehicle Removal** - Remove a vehicle from the dealership data system.

// In progress: Demo samples...

10. **Exit Application** - Closes the application.

// In progress: Demo samples... 
