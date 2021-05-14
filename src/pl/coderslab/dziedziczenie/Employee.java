package pl.coderslab.dziedziczenie;

public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double wage;

    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public double raiseWage(int procent){
        if (procent < 0 ){
            return 0;
        }
        this.wage += (this.wage * procent) / 100;
        return this.wage;
    }
}
