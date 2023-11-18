public class Temporary extends Employee implements Contract {

    private int hourlySalary;

    private int accumulatedHours;

    public Temporary(int hourlySalary, int accumulatedHours) {
        this.accumulatedHours = accumulatedHours;
        this.hourlySalary = hourlySalary;
    }


    @Override
    public double annualIncome() {
        return 0;
    }

    @Override
    public boolean contractInfo() {
        return false;
    }
}

