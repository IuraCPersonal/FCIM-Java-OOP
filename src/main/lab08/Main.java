package main.lab08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<GeometricBody> geometrics = new ArrayList<>();

        geometrics.add(new Cube(13));
        geometrics.add(new Parallelepiped(2, 13.5, 4));
        geometrics.add(new Sphere(3.08));

        System.out.println("\nFigure with the biggest surface:");
        System.out.println(GeometricBodyController.getBiggestSurface(geometrics));

        System.out.println("\nFigure with the biggest volume:");
        System.out.println(GeometricBodyController.getBiggestVolume(geometrics));

    }
}
