package main.lab02;

public class Main {

    public static void main(String []args) {

        // 3 objects of Box type
        // Without parameters
        Box Box1 = new Box();
        System.out.println(Box1.toString());
        System.out.println("Area: " + Box1.Area());
        System.out.println("Volume: " + Box1.Volume());

        // With 1 parameter
        Box Box2 = new Box(25);
        System.out.println(Box2.toString());
        System.out.println("Area: " + Box2.Area());
        System.out.println("Volume: " + Box2.Volume());

        // With 3 parameters
        Box Box3 = new Box(10, 15, 20);
        System.out.println(Box3.toString());
        System.out.println("Area: " + Box3.Area());
        System.out.println("Volume: " + Box3.Volume());

        Queue<Integer> q = new Queue<Integer>(4);

    }

}
