package classes.Employee;

import classes.Vehicle.Vehicle;

public class Tester extends Employee {
    private int nbBugs;
    private static final int GAIN_FACTOR_ERROR = 10;

    public Tester(String name, int year, int nbBugs, int rate, Vehicle vehicle) {
        super(name, year, rate, vehicle);
        this.nbBugs = nbBugs;
    }

    public Tester(String name, int year, int nbBugs, int rate) {
        super(name, year, rate);
        this.nbBugs = nbBugs;
    }

    public int getNbBugs() {
        return nbBugs;
    }

    public void setNbBugs(int nbBugs) {
        this.nbBugs = nbBugs;
    }

    @Override
    public String toString() {
        return "" + super.toString() + " and corrected "
                + this.nbBugs
                + " bugs.\n"
                + "His/Her estimated annual income is "
                + this.annualIncome();
    }

    public double getBonus() { return GAIN_FACTOR_ERROR * nbBugs; }
}
