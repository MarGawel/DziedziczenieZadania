package pl.coderslab.dziedziczenie;

public class Shape {
    protected double x;
    protected double y;
    protected String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription(){
       return "punkt x: " + this.x + ", punkt y: " + this.y + ", color: " + this.color;
    }

    public double getDistance(Shape shape){
        double a = Math.abs(shape.x - this.x);
        double b = Math.abs(shape.y - this.y);
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

    }

}
