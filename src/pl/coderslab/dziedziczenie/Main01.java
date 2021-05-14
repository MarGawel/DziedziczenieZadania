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
    }
}
