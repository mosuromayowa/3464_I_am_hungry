public class Programmer extends Employee{

    private int nbProject;
    // Programmer: name, birthYear, nbProjects, rate
    public Programmer(String name, int year, int nbProject, int rate) {
        super(name,year);
        this.nbProject = nbProject;
    }

    public Programmer(String name, int year, int nbProject) {
        super(name,year);
        this.nbProject = nbProject;
    }

}
