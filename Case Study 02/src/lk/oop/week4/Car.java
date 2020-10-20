package lk.oop.week4;

import java.awt.*;

public class Car extends Vehicle {
    private int doorNumber;
    private Color color;
    int countCar;

    public Car(String idPlate, String brand, DateTime entryDateTime, int doorNumber, Color color) {
        super(idPlate, brand, entryDateTime);
        this.doorNumber = doorNumber;
        this.color = color;
        countCar++;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public String getVehicleType() {
        return "Car";
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "doorNumber=" + doorNumber +
                ", color='" + color + '\'' +
                '}';
    }
}
