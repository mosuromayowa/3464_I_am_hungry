public class Manager extends Employee {

    private int nbTravelDays;

    private int nbClients;

    // Manager: name, birthYear, nbClients, nbTravelDays, rate
    public Manager (String name,  int birthYear,  int nbClients, int nbTravelDays, int rate){
        super(name,birthYear);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    public int getNbClients() {
        return nbClients;
    }

    public int getNbTravelDays() {
        return nbTravelDays;
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays) {
        super(name, birthYear);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;

    }

}
