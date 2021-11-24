package main.lab07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Figure> figures = new ArrayList<>();

        figures.add(new Rectangle(2, 4));
        figures.add(new Square(5));
        figures.add(new Triangle(4.14, 4, 2.33));


        System.out.println(FigureController.getBiggestArea(figures));
        System.out.println(FigureController.getBiggestPerimeter(figures));

        Figure Circle = new Figure() {
            public final double radius = 3.32;
            public final double pi = 3.14;

            @Override
            public double getArea() {
                return pi * radius * radius;
            }

            @Override
            public double getPerimeter() {
                return 2 * pi * radius;
            }

            @Override
            public String toString() {
                return "Circle";
            }
        };

        System.out.println("Area Circle : " + Circle.getArea());
        System.out.println("Perimeter Circle : " + Circle.getPerimeter());

        figures.add(Circle);

        System.out.println(FigureController.getBiggestPerimeter(figures));
        System.out.println(FigureController.getBiggestArea(figures));
    }
}
