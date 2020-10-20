package lk.oop.week4;

public class Motorbike extends Vehicle {
    private int engineCapacity;

    public Motorbike(String idPlate, String brand, DateTime entryDateTime, int engineCapacity) {
        super(idPlate, brand, entryDateTime);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }


    @Override
    public String getVehicleType() {
        return "Motorbike";
    }

    @Override
    public String toString() {
        return "Motorbike{" + super.toString() +
                "engineCapacity=" + engineCapacity +
                '}';
    }
}
