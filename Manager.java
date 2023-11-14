public class Manager extends Employee {

    private int nbTravelDays;

    private int nbClients;

    public Manager (String name,  int birthYear, int age, int rate, int nbClients, int nbTravelDays){
        super(name, birthYear, age, rate);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

}
