public class Programmer extends Employee{

    private int nbProject;
    // Programmer: name, birthYear, nbProjects, rate
    public Programmer(String name, int birthYear, int nbProject, int rate, Motorcycle motorcycle) {
        super(name,birthYear,rate,nbProject);
        this.nbProject = nbProject;
    }

    public Programmer(String name, int birthYear, int nbProject) {
        super(name,birthYear);
        this.nbProject = nbProject;

    }


    public Programmer(String name, int birthYear, int nbProject, int i2, Car car) {

    }

    public Programmer (String name, int year, int nbProject, Vehicle vehicle) {

    }


    public Programmer(String name, int year, int nbProject, int i) {
        super(name,year,nbProject,i);

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
