package lk.oop.week4;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WestminsterCarParkManager implements CarParkManager {
    private static final int maxLotSize = 20; // Max number of slots
    private List<Vehicle> vehicleList = new ArrayList<>(); // Creating a array list to store the parked vehicles


    @Override
    public void addVehicle(Vehicle vehicle) {
        if(vehicleList.size() <= maxLotSize){
            vehicleList.add(vehicle);
            int leftSlots = maxLotSize - vehicleList.size();
            System.out.println("Number of Available slots " + leftSlots);
        }
    }

    @Override
    public void deleteVehicle() {
        System.out.println("Please enter the vehicle ID Plate : ");
        Scanner scanner = new Scanner(System.in);
        String delId = scanner.nextLine();
        for(int i = 0; i < maxLotSize; i++) {
            if(vehicleList.get(i).getIdPlate() == delId ) {
                System.out.println("A " + vehicleList.get(i).getVehicleType() + " is leaving");
                vehicleList.remove(i);
            }
        }

    }

    @Override
    public void printCurrentVehicle() {
        for(int i = vehicleList.size()-1; i <=0; i--) {
            System.out.println("Vehicle ID : " + vehicleList.get(i).getIdPlate() + " Entry Time : " + vehicleList.get(i).getEntryDateTime() + " Type : " + vehicleList.get(i).getVehicleType());
        }
    }

    @Override
    public void printVehiclePercentage() {
        int countCar = 0;
        int countVan = 0;
        int countMotorbike = 0;
        for(int i = 0; i < maxLotSize; i++) {
            if(vehicleList.get(i).getVehicleType().equals("Car")) {
                countCar++;
            } else if (vehicleList.get(i).getVehicleType().equals("Van")) {
                countVan++;
            } else {
                countMotorbike++;
            }
        }
        System.out.println("Percentage of Cars : " + (countCar/vehicleList.size()*100));
        System.out.println("Percentage of Vans : " + (countVan/vehicleList.size()*100));
        System.out.println("Percentage of Motorbike : " + (countMotorbike/vehicleList.size()*100));
    }

    @Override
    public void printLongestParked() {
        int lastParked = 0;
        System.out.println("ID Plate : " + vehicleList.get(lastParked).getIdPlate() + " Vehicle Type : " + vehicleList.get(lastParked).getVehicleType() +
                " Entry Time : " + vehicleList.get(lastParked).getEntryDateTime());


    }

    @Override
    public void printLatestParked() {
        int latestParked = vehicleList.size()-1;
        System.out.println("ID Plate : " + vehicleList.get(latestParked).getIdPlate() + " Vehicle Type : " + vehicleList.get(latestParked).getVehicleType() +
                " Entry Time : " + vehicleList.get(latestParked).getEntryDateTime());

    }

    @Override
    public void printVehicleByDate() {

    }



   /*public static void main(String[] args) {
        WestminsterCarParkManager westminsterCarParkManager = new WestminsterCarParkManager();
        exitMenu:

       while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("#####Welcome to Westminster Car Park Manager#####");
            System.out.println("----Please select the menu option to continue----");
            System.out.println("Enter (A) to add a vehicle");
            System.out.println("Enter (D) to delete a vehicle");
            System.out.println("Enter (C) to get the currently parked vehicles");
            System.out.println("Enter (E) to get the percentage of the vehicles");
            System.out.println("Enter (F) to get the longest parked vehicle");
            System.out.println("Enter (G) to get the latest parked vehicle");
            System.out.println("Enter (H) to search vehicle by the date");
            System.out.print("Enter (Q) to exit the programme : ");

            switch (scanner.next().toUpperCase()){
                case "A":
                    //westminsterCarParkManager.addVehicle();
                    break;
                case "D":
                    westminsterCarParkManager.deleteVehicle();
                    break;
                case "C":
                    westminsterCarParkManager.printCurrentVehicle();
                    break;
                case "E":
                    westminsterCarParkManager.printVehiclePercentage();
                    break;
                case "F":
                    westminsterCarParkManager.printLongestParked();
                    break;
                case "G":
                    westminsterCarParkManager.printLatestParked();
                    break;
                case "H":
                    westminsterCarParkManager.printVehicleByDate();
                    break;
                case "Q":
                    break exitMenu;
            }
        }
    }*/

    @Override
    public boolean runMenu() {
        boolean exit = false;

        System.out.println("#####Welcome to Westminster Car Park Manager#####");
        System.out.println("----Please select the menu option to continue----");
        System.out.println("Enter (A) to add a vehicle");
        System.out.println("Enter (D) to delete a vehicle");
        System.out.println("Enter (C) to get the currently parked vehicles");
        System.out.println("Enter (E) to get the percentage of the vehicles");
        System.out.println("Enter (F) to get the longest parked vehicle");
        System.out.println("Enter (G) to get the latest parked vehicle");
        System.out.println("Enter (H) to search vehicle by the date");
        System.out.print("Enter (Q) to exit the programme : ");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.next().toUpperCase()){
            case "A":
                System.out.println("#####Please Select the Vehicle Type#####");
                System.out.println("Press 1 if you want to add a Car");
                System.out.println("Press 2 if you want to add a Van");
                System.out.print("Press 3 if you want to add a Motorbike : ");
                int selectType = scanner.nextInt();

                // Getting the super class attribute values
                System.out.println("Enter the ID Plate Number : ");
                String idPlateNumber = scanner.next();

                System.out.println("Enter the brand name : ");
                String brandName = scanner.next();

                System.out.println("Enter the entry date");
                System.out.println("Enter the day : ");
                int day = scanner.nextInt();
                System.out.println("Enter the month : ");
                int month = scanner.nextInt();
                System.out.println("Enter the year : ");
                int year = scanner.nextInt();
                System.out.println("Enter the hour : ");
                int hour = scanner.nextInt();
                System.out.println("Enter the minutes : ");
                int minutes = scanner.nextInt();
                DateTime dateTime = new DateTime(day,month,year,hour,minutes);

                switch (selectType) {
                    case 1:
                        // If the vehicle type is a car
                        System.out.println("Enter the door number : ");
                        int doorNo = scanner.nextInt();
                        System.out.println("Enter the color : ");
                        Color colorCar = Color.decode(scanner.next());
                        Car car = new Car(idPlateNumber,brandName,dateTime,doorNo,colorCar);
                        this.addVehicle(car);
                        break;
                    case 2:
                        // If the vehicle type is a van
                        System.out.println("Enter the volume of the cargo : ");
                        int volCargo = scanner.nextInt();
                        Van van = new Van(idPlateNumber,brandName,dateTime,volCargo);
                        this.addVehicle(van);
                        break;
                    case 3:
                        // If the vehicle type is a motorbike
                        System.out.println("Enter the engine capacity : ");
                        int engineCap = scanner.nextInt();
                        Motorbike motorbike = new Motorbike(idPlateNumber,brandName,dateTime,engineCap);
                        this.addVehicle(motorbike);
                        break;
                }
                break;
            case "D":
                this.deleteVehicle();
                break;
            case "C":
                this.printCurrentVehicle();
                break;
            case "E":
                this.printVehiclePercentage();
                break;
            case "F":
                this.printLongestParked();
                break;
            case "G":
                this.printLatestParked();
                break;
            case "H":
                this.printVehicleByDate();
                break;
            case "Q":
                exit = true;
                break;
        }
        return exit;
    }

    public static void main(String[] args) {
        CarParkManager carParkManager = new WestminsterCarParkManager();
        boolean exit = false;
        while (!exit) {
            exit = carParkManager.runMenu();
        }
    }
}
