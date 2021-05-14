package pl.coderslab.dziedziczenie;

public class AdvancedCalculator extends Calculator{
    public AdvancedCalculator() {
        super();
    }

    public double pow(double num1, double num2){
        double result = Math.pow(num1,num2);
        String operation = num1 + " ^ " + num2 + " equals " + result;
        addToOperations(operation);
        return result;
    }

    public double root(double num1, double num2){
        if (num2 == 0){
            throw new ArithmeticException("Nie zrobisz pierwiastka zerowego stopnia.");
        }
        double result = Math.pow(num1, 1/num2);
        String operation = num2 + " root of " + num1 + " equals " + result;
        addToOperations(operation);
        return result;
    }
}
