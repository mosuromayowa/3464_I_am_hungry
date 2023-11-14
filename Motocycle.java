public class Motorcycle extends Employee.Vehicle {

    private boolean sidecar;

    // make, plate, color, category, sidecar
    public Motorcycle(String make, String plate, String color, String category, boolean sidecar, VehicleType type) {
        super(make, plate, color, VehicleType.RACE);
        this.sidecar = sidecar;
    }

    public Motorcycle(String make, String plate, String color, VehicleType vehicleType, boolean sidecar) {
        super();
    }

    public boolean isSidecar() {
        return sidecar;
    }
}
