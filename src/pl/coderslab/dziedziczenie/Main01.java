package pl.coderslab.dziedziczenie;

public class Main01 {
    public static void main(String[] args) {
        AdvancedCalculator cal = new AdvancedCalculator();

        System.out.println("-----Calculator----");
        cal.pow(2, 2);
        cal.root(27, 3);
        try {
            cal.root(27, 0);
            cal.divide(4, 0);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
        cal.printOperations();
        cal.clearOperations();
        cal.printOperations();
        System.out.println("-------------------");

        System.out.println("-------Shape-------");
        Shape shape1 = new Shape(3, 4, "red");
        Shape shape2 = new Shape(0, 0, "Blue");

        System.out.println(shape1.getDescription());
        System.out.println(shape2.getDescription());

        System.out.println(shape1.getDistance(shape2));

        System.out.println("-------------------");

        Circle circle = new Circle(3, 4, "black", 4);

        System.out.println(circle.getDescription());
        System.out.println(circle.getCircuit());
        System.out.println(circle.getArea());
        System.out.println(circle.getDistance(shape2));

        System.out.println("-------------------");
        System.out.println("-------Employee----");

        Employee em1 = new Employee(1, "Marcin", "Gaweł", 100);
        HourlyEmployee em2 = new HourlyEmployee(2, "Jan", "Kowalski", 50);
        SalariedEmployee em3 = new SalariedEmployee(3, "Adam", "Nowak", 10);

        System.out.println(em1.raiseWage(10));
        System.out.println(em2.raiseWage(10));
        System.out.println(em2.calculatePayment(10));
        System.out.println(em3.calculatePayment());
        System.out.println("-------------------");

    }
}
