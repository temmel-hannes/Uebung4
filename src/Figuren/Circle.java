package Figuren;

public class Circle extends Figure{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        double pi = Math.PI;
        return 2*pi*radius;
    }

    public double getArea(){
        double pi = Math.PI;
        return radius*radius*pi;
    }
}
