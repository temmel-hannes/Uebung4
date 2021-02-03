package Figuren;

public class Rectangle extends Figure{
    protected double lenght;
    protected double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getPerimeter(){
        return 2*(lenght + width);
    }

    public double getArea(){
        return lenght * width;
    }
}
