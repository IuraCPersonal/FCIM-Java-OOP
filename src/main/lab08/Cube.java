package main.lab08;

class Cube implements GeometricBody {
    private final double length;

    Cube(double length) {
        this.length = length;
    }

    @Override
    public double getSurface() {
        return length * length;
    }

    public double getVolume() {
        return getSurface() * length;
    }

    @Override
    public String toString() {
        return "Cube";
    }
}