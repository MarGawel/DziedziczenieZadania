package pl.coderslab.dziedziczenie;

public class SalariedEmployee extends Employee{
    final static int hours = 190;

    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public  double calculatePayment(){
        return this.wage * hours;

    }
}
