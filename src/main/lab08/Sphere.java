package main.lab08;

public class Sphere implements GeometricBody {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurface() {
        return 4 * 3.14 * radius * radius;
    }

    public double getVolume() {
        return getSurface() * radius / 3;
    }

    @Override
    public String toString() {
        return "Sphere";
    }
}