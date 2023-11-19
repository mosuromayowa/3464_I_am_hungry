public abstract class Employee implements Contract {


    private int birthYear;
    private String name;
    private int rate;

    private int age;

// privet vehicle vehicle
    public Employee(String name, int birthYear, int rate, int nbTravelDays) {
        this.name = name;
        this.birthYear = birthYear;
        this.rate = rate;
    }

    public Employee() {

    }

    public Employee(String _name, int birthYear) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getRate() {
        return rate;
    }

    public int getAge() {
        final int current_year = 2023;
        age = current_year - birthYear;
        return age;
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

public abstract double annualIncome();

    @Override
    public void signContract() {
    }

}

