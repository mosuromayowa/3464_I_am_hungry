package classes.Employee;

import java.time.Year;

import classes.Contract.Permanent;
import classes.Contract.Temporary;
import classes.Vehicle.Car;
import classes.Vehicle.Motorcycle;
import classes.Vehicle.Vehicle;
import classes.Contract.Contract;

public abstract class Employee implements interfaces.Contract {
    // name can't be changed once initialised
    private final String name;
    private int birthYear;
    private int age;
    private float monthlySalary;
    private int rate = 100;
    private Vehicle vehicle;
    private double cumulativeSalary = 0;
    private Contract contract;

    public Employee(String name, int birthYear, float monthlySalary, int rate, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.age = Year.now().getValue() - birthYear;
        this.monthlySalary = monthlySalary;
        this.setRate(rate);
        this.vehicle = vehicle;
        System.out.println("We have a new employee: " + this.getName() + ", a " + this.getEmpType() + ".");
    }

    public Employee(String name, int birthYear, int rate, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.age = Year.now().getValue() - birthYear;
        this.setRate(rate);
        this.vehicle = vehicle;
        System.out.println("We have a new employee: " + this.getName() + ", a " + this.getEmpType() + ".");
    }

    public Employee(String name, int birthYear, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.age = Year.now().getValue() - birthYear;
        this.vehicle = vehicle;
        System.out.println("We have a new employee: " + this.getName() + ", a " + this.getEmpType() + ".");
    }

    public Employee(String name, int birthYear, int rate) {
        this.name = name;
        this.birthYear = birthYear;
        this.age = Year.now().getValue() - birthYear;
        this.setRate(rate);
        System.out.println("We have a new employee: " + this.getName() + ", a " + this.getEmpType() + ".");
    }

    public Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        System.out.println("We have a new employee: " + this.getName() + ", a " + this.getEmpType() + ".");
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        if (rate <= 10) this.rate = 10;
        else if (rate >= 100) this.rate = 100;
        else if (rate > 10 && rate < 100) this.rate = rate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getCumulativeSalary() {
        return cumulativeSalary;
    }

    public void setCumulativeSalary(double cumulativeSalary) {
        this.cumulativeSalary = cumulativeSalary;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", a " + this.getEmpType() + "\n"
                + "Age: " + this.getAge() + "\n"
                + (this.vehicle instanceof Vehicle ?
                ("Employee has a " + this.vehicle) : "") + "\n"
                + this.name
                + " has an Occupation rate: "
                + this.rate
                + "%";
    }

    public abstract double getBonus();

    public double annualIncome() {
        return (12 * this.monthlySalary * rate) + this.getBonus() + this.cumulativeSalary;
    }

    private String getEmpType() {
        if (this instanceof Manager) return "Manager";
        if (this instanceof Programmer) return "Programmer";
        return "Tester";
    }

    protected String getVehicleType() {
        if (this.vehicle instanceof Car) return "car";
        if (this.vehicle instanceof Motorcycle) return "motorcycle";
        return "";
    }

    @Override
    public void signContract(Contract contract) {
        this.contract = contract;
        this.cumulativeSalary = this.cumulativeSalary + contract.accumulatedSalary();
    }

    @Override
    public String contractInfo() {
        if (this.contract instanceof Permanent) {
            return this.getName()
                    + " is a " + this.getEmpType() + ". He is"
                    + (((Permanent) this.contract).isMarried() ? "" : " not")
                    + " married and he/she has "
                    + ((Permanent) this.contract).getNbChildren()
                    + " children.\n"
                    + "He/She has worked for "
                    + ((Permanent) this.contract).getNbDaysWorked()
                    + " days and upon contract his/her monthly salary is "
                    + this.contract.accumulatedSalary()
                    + ".\n";
        }
        return this.getName()
                + " is a " + this.getEmpType() + ". He is a temporary employee with "
                + ((Temporary) this.contract).getHourlyWages()
                + " salary and he has worked for "
                + ((Temporary) this.contract).getNbHrsPerMonth()
                + " hours.\n";
    }
}
