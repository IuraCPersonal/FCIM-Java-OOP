package main.lab02;

// The Box Class

public class Box {

    public int height;
    public int width;
    public int depth;
    public boolean regular;

    // Without parameters
    public Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
        this.regular = true;
    }

    // With 1 parameter
    public Box(Integer same) {
        this.height = same;
        this.width = same;
        this.depth = same;
        this.regular = true;
    }

    // With 3 parameters
    public Box(Integer height, Integer width, Integer depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.regular = false;
    }

    @Override
    public String toString() {
        return  "+---------+" + "\n" +
                "Height: " + this.height + "\n" +
                "Width: " + this.width + "\n" +
                "Depth: " + this.depth;
    }

    public Integer Area() {
        if (regular) {
            return 6 * this.width * this.width;
        }
        return 2 * (this.width * this.height + this.width * this.depth + this.height * this.depth);
    }

    public Integer Volume() {
        return this.depth * this.width * this.height;
    }

}
