package pl.coderslab.dziedziczenie;

public class HourlyEmployee extends Employee{
    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public double calculatePayment(int hours){
        return hours * this.wage;
    }
}
