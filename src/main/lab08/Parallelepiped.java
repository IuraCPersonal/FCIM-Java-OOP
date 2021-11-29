package main.lab08;

class Parallelepiped implements GeometricBody {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return length * width;
    }

    @Override
    public double getVolume() {
        return getSurface() * height;
    }

    @Override
    public String toString() {
        return "Parallelepiped";
    }
}