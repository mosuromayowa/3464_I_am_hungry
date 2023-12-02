package classes.Contract;

public class Temporary extends Contract {
    private double hourlyWages;
    private int nbHrsPerMonth;

    public Temporary(double hourlyWages, int nbHrsPerMonth) {
        super();
        this.hourlyWages = hourlyWages;
        this.nbHrsPerMonth = nbHrsPerMonth;
    }

    public double getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(double hourlyWages) {
        this.hourlyWages = hourlyWages;
    }

    public int getNbHrsPerMonth() {
        return nbHrsPerMonth;
    }

    public void setNbHrsPerMonth(int nbHrsPerMonth) {
        this.nbHrsPerMonth = nbHrsPerMonth;
    }

    public double accumulatedSalary() {
        return this.nbHrsPerMonth * this.hourlyWages;
    }
}

