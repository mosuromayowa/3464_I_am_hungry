public class Car extends Employee.Vehicle {

    private String gear;

    private String type;

    public String getGear() {
        return gear;
    }

    public String getType() {
        return type;
    }
    // make, plate, color, category, gear, type
    public Car (String make, String plate, String color, String gear) {
        super(make,plate,color,VehicleType.RACE);
        this.gear = gear;

        //Overloading the methods for the cars






    }

}
