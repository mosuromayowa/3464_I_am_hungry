public class Manager extends Employee implements Contract {

    public void signContract() {

    }

    @Override
    public boolean contractInfo() {
        return false;
    }


    private int nbTravelDays;

    private int nbClients;

    // Manager: name, birthYear, nbClients, nbTravelDays, rate
    public Manager (String name,  int birthYear,  int nbClients, int nbTravelDays, int rate){
        super(name,birthYear, rate, nbTravelDays);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;

    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, Vehicle vehicle) {
        super();
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays)
    {
        super(name,birthYear,nbClients,nbTravelDays);
    }



    public int getNbClients() {
        return nbClients;
    }

    public int getNbTravelDays() {
        return nbTravelDays;
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, int rate, Vehicle vehicle) {
        super(name,birthYear,rate, nbTravelDays);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;

    }

    public void setNbClients(int nbClients) {
        this.nbClients = nbClients;
    }

    @Override
    public double annualIncome() {
        return 0;
    }

   // @Override
   // public String toString() {
    //    return "Manager{name='" + getName() + "', birthYear=" + getBirthYear() + ", nbClients=" + getNbClients() + ", nbTravelDays=" + getNbTravelDays() + ", rate=" + getRate() + ", employeeVehicle=" + employeeVehicle + '}';
   // }* /

}

