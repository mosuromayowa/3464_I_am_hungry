public class Car extends Employee.Vehicle {

    private String gear;

    private String type;

    public Car(String make, String plate, String color, String family, Gear gear, CarType carType) {
        //Overloading the methods for the cars
    }


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









    }

}
