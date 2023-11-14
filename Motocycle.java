public class Motorcycle extends Employee.Vehicle {

    private boolean sidecar;

    // make, plate, color, category, sidecar
    public Motorcycle(String make, String plate, String color, String category, boolean sidecar) {
        super(make, plate, color);
        this.sidecar = sidecar;

    }

    public boolean isSidecar() {
        return sidecar;
    }
}
