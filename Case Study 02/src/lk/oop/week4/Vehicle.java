package lk.oop.week4;

public abstract class Vehicle {
    private String idPlate;
    private String brand;
    private DateTime entryDateTime;

    public Vehicle(String idPlate, String brand, DateTime entryDateTime) {
        this.idPlate = idPlate;
        this.brand = brand;
        this.entryDateTime = entryDateTime;
    }

    public String getIdPlate() {
        return idPlate;
    }

    public void setIdPlate(String idPlate) {
        this.idPlate = idPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public DateTime getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(DateTime entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    public abstract String getVehicleType();


    @Override
    public String toString() {
        return
                "idPlate='" + idPlate + '\'' +
                ", brand='" + brand + '\'' +
                ", entryDateTime=' " + entryDateTime + '\''
                ;
    }
}
