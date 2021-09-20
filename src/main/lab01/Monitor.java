package main.lab01;

// The Monitor Class

class Monitor {

    public String color;
    public String dimension;
    public String resolution;

    Monitor(String color, String dimension, String resolution) {
        this.color = color;
        this.dimension = dimension;
        this.resolution = resolution;
    }

    public void display() {
        System.out.println("Color      : " + this.color);
        System.out.println("Dimension  : " + this.dimension);
        System.out.println("Resolution : " + this.resolution);
    }
}


