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
    public Car (String make, String plate, String color,String category, String gear, String type) {
        super(make,plate,color);
        this.gear = gear;
        this.type = type;



    }

}
