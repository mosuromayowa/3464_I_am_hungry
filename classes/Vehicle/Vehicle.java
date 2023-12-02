package classes.Vehicle;

import enums.VehicleType;

public class Vehicle {
    private String make;
    private String plate;
    private String color;
    private VehicleType category; // using the enum here

    public Vehicle(String make, String plate, String color, VehicleType category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getCategory() {
        return category;
    }

    public void setCategory(VehicleType category) {
        this.category = category;
    }

    private String getVehicleType() {
        return this instanceof Car ? "car" : "motorcycle";
    }

    @Override
    public String toString() {
        return this.getVehicleType()
                + "\n\t- make: " + this.make
                +"\n\t- plate: " + this.plate
                +"\n\t- color: "+ this.color
                +"\n\t- category: " + this.category;
    }
}
