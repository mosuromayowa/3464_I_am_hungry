public class Tester extends Employee{

    private int nbugs;

    // Tester: name, birthYear, nbBugs, rate
    public Tester(String name, int year, int nbugs, int rate, Motorcycle m2) {
        super();
        this.nbugs = nbugs;

    }

    @Override
    public double annualIncome() {
        return 0;
    }
}
