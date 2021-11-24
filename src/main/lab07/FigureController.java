package main.lab07;

import java.util.ArrayList;

public class FigureController {

    public static Figure getBiggestArea(ArrayList<Figure> figures) {
        Figure max = figures.get(0);

        for (Figure figure : figures) {
            if (max.getArea() > figure.getArea()) {
                max = figure;
            }
        }

        return max;
    }

    public static Figure getBiggestPerimeter(ArrayList<Figure> figures) {
        Figure max = figures.get(0);

        for (Figure figure : figures) {
            if (max.getArea() > figure.getPerimeter()) {
                max = figure;
            }
        }

        return max;
    }

}
