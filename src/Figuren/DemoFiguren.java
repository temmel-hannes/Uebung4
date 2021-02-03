package Figuren;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class DemoFiguren {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();

        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(10.0);
        Circle c3 = new Circle(20.0);
        Rectangle r1 = new Rectangle(5.0, 15.0);
        Rectangle r2 = new Rectangle(10.0, 10.0);
        Rectangle r3 = new Rectangle(15.0, 5.0);

        FigureManager fm = new FigureManager(figures);

        figures.add(c1);
        figures.add(c2);
        figures.add(c3);
        figures.add(r1);
        figures.add(r2);
        figures.add(r3);

        System.out.println(fm.getMaxPerimeter());
        System.out.println(fm.getAvgAreaSize());
        System.out.println(fm.getAreaBySizeCategories());
    }
}
