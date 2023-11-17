public class Programmer extends Employee{

    private int nbProject;
    // Programmer: name, birthYear, nbProjects, rate
    public Programmer(String name, int year, int nbProject, int rate, Motorcycle motorcycle) {
        super();
        this.nbProject = nbProject;
    }

    public Programmer(String name, int year, int nbProject) {
        super();
        this.nbProject = nbProject;
    }


    public Programmer(String name, int year, int nbProject, int i2, Car car) {

    }

    public Programmer (String name, int year, int nbProject, Vehicle vehicle) {

    }


    public Programmer(String name, int year, int nbProject, int i) {

    }

    @Override
    public double annualIncome() {
        return 0;
    }
}
