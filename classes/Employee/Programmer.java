package classes.Employee;

import classes.Vehicle.Vehicle;

public class Programmer extends Employee {
    private int nbProjects;
    private static final int GAIN_FACTOR_PROJECTS = 200;

    public Programmer(String name, int year, int nbProjects, int rate, Vehicle vehicle) {
        super(name, year, rate, vehicle);
        this.nbProjects = nbProjects;
    }

    public Programmer(String name, int year, int nbProjects, Vehicle vehicle) {
        super(name, year, vehicle);
        this.nbProjects = nbProjects;
    }

    public Programmer(String name, int year, int nbProjects, int rate) {
        super(name, year, rate);
        this.nbProjects = nbProjects;
    }

    public Programmer(String name, int year, int nbProjects) {
        super(name, year);
        this.nbProjects = nbProjects;
    }

    public int getNbProjects() {
        return nbProjects;
    }

    public void setNbProjects(int nbProjects) {
        this.nbProjects = nbProjects;
    }

    @Override
    public String toString() {
        return "" + super.toString() + " and completed "
                + this.nbProjects
                + " projects.\n"
                + "His/Her estimated annual income is "
                + this.annualIncome();
    }

    public double getBonus() { return GAIN_FACTOR_PROJECTS * nbProjects; }
}
