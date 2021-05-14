package pl.coderslab.dziedziczenie;

public class Circle extends Shape{
    private double radius;

    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String getDescription(){
        return "punkt x: " + this.x + ", punkt y: " + this.y + ", color: " + this.color + ", radius: " + radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircuit(){
        return 2 * Math.PI * this.radius;
    }
}
