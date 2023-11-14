public class Employee {

    private int birthYear;
    private String name;
    private int rate;

    public Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.rate = this.rate;

    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public static class Vehicle { // This would represent the composite association

        private String make;
        private String plate;
        private String color;

        private VehicleType type; // using the enum here

        public Vehicle(String make, String plate, String color, VehicleType type) {
            this.make = make;
            this.plate = plate;
            this.color = color;
            this.type = type;

        }
        public Vehicle() {

        }

        public String getMake() {
            return make;
        }

        public String getPlate() {
            return plate;
        }

        public String getColor() {
            return color;
        }


    }

}

