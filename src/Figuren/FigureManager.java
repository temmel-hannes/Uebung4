package Figuren;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    ArrayList<Figure> figureList = new ArrayList<>();

    public FigureManager(ArrayList<Figure> figureList) {
        this.figureList = figureList;
    }

    public void addFigure(Figure f){
        figureList.add(f);
    }

    public double getMaxPerimeter(){
        double maxPerimeter = 0.0;
        for (Figure f: figureList) {
            if (f.getPerimeter()>maxPerimeter){
                maxPerimeter = f.getPerimeter();
            }
        }
        return maxPerimeter;
    }

    public double getAvgAreaSize(){
        double avg = 0.0;
        for (Figure f: figureList) {
            avg += f.getArea();
        }
        return avg;
    }

    public HashMap<String, Double> getAreaBySizeCategories(){
        HashMap<String, Double> h1 = new HashMap<>();
        double size=0;
        for (Figure figure : figureList) {
            size += figure.getArea();
        }

        if (size < 1000){
            h1.put("Klein", size);
        }
        else if (size >= 1000 && size <= 4999) {
            h1.put("Mittel", size);
        }
        else if (size >= 5000) {
            h1.put("Groß", size);
        }

        return h1;
    }
}
