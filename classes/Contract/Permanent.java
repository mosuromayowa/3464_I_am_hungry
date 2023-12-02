package classes.Contract;

public class Permanent extends Contract {
    private int nbDaysWorked;
    private double fixedSalary;
    private int nbChildren;
    private boolean isMarried;
    private int monthlyPremiumPerChild;
    private static final int NBR_DAYS_PER_MONTH = 20;

    public Permanent(int nbChildren, boolean isMarried, int fixedSalary, int monthlyPremiumPerChild, int nbDaysWorked) {
        super();
        this.nbChildren = nbChildren;
        this.isMarried = isMarried;
        this.fixedSalary = fixedSalary;
        this.monthlyPremiumPerChild = monthlyPremiumPerChild;
        this.nbDaysWorked = nbDaysWorked;
    }

    public int getNbDaysWorked() {
        return nbDaysWorked;
    }

    public void setNbDaysWorked(int nbDaysWorked) {
        this.nbDaysWorked = nbDaysWorked;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public int getNbChildren() {
        return nbChildren;
    }

    public void setNbChildren(int nbChildren) {
        this.nbChildren = nbChildren;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public int getMonthlyPremiumPerChild() {
        return monthlyPremiumPerChild;
    }

    public void setMonthlyPremiumPerChild(int monthlyPremiumPerChild) {
        this.monthlyPremiumPerChild = monthlyPremiumPerChild;
    }

    public double accumulatedSalary() {
        return this.nbDaysWorked *
                (this.fixedSalary +
                        (this.isMarried ? this.monthlyPremiumPerChild * this.nbChildren : 0)
                ) / NBR_DAYS_PER_MONTH;
    }
}
