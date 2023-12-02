package classes.Employee;

import classes.Vehicle.Vehicle;

public class Manager extends Employee {
    private int nbTravelDays;
    private int nbClients;
    private static final int GAIN_FACTOR_CLIENT = 500;
    private static final int GAIN_FACTOR_TRAVEL = 100;

    public Manager (String name, int birthYear, float monthlySalary, int rate, Vehicle vehicle, int nbClients, int nbTravelDays){
        super(name, birthYear, monthlySalary, rate, vehicle);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    public Manager (String name, int birthYear, int nbClients, int nbTravelDays, int rate, Vehicle vehicle){
        super(name, birthYear, rate, vehicle);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    public Manager (String name, int birthYear, int nbClients, int nbTravelDays, Vehicle vehicle){
        super(name, birthYear, vehicle);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    public Manager (String name, int birthYear, int nbClients, int nbTravelDays, int rate){
        super(name, birthYear, rate);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    public Manager (String name, int birthYear, int nbClients, int nbTravelDays) {
        super(name, birthYear);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    public int getNbClients() {
        return nbClients;
    }

    public int getNbTravelDays() {
        return nbTravelDays;
    }

    public void setNbTravelDays(int nbTravelDays) {
        this.nbTravelDays = nbTravelDays;
    }

    public void setNbClients(int nbClients) {
        this.nbClients = nbClients;
    }

    @Override
    public String toString() {
        return "" + super.toString() + ". He/She travelled "
                + this.nbTravelDays
                + " days and has brought "
                + this.nbClients
                + " new clients.\n"
                + "His/Her estimated annual income is "
                + this.annualIncome();
    }

    public double getBonus() { return (GAIN_FACTOR_CLIENT * nbClients) + (GAIN_FACTOR_TRAVEL * nbTravelDays); }
}
