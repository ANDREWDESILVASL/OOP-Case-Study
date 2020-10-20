package lk.oop.week4;

public interface CarParkManager {
    public abstract void addVehicle(Vehicle vehicle);
    public abstract void deleteVehicle();
    public abstract void printCurrentVehicle();
    public abstract void printVehiclePercentage();
    public abstract void printLongestParked();
    public abstract void printLatestParked();
    public abstract void printVehicleByDate();
    public abstract boolean runMenu();
}
