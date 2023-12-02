package classes.Vehicle;

import enums.VehicleType;

public class Motorcycle extends Vehicle {
    private boolean sidecar;

    public Motorcycle(String make, String plate, String color, VehicleType category, boolean sidecar) {
        super(make, plate, color, VehicleType.RACE);
        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        return "" + super.toString()
                + "\n\t-" + (this.sidecar ? " with" : " without") + " sidecar";
    }
}
