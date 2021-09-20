package main.lab01;

public class Main {

    public static void main(String []args) {
        // Create a Monitor
        Monitor Samsung = new Monitor("Gray", "32 inch", "1920x1080");
        System.out.println("-- Init --");
        Samsung.display();

        // Update the Monitor's properties
        Samsung.color = "Black";
        Samsung.dimension = "23 inch";
        Samsung.resolution = "800x600";

        // Display the Changes
        System.out.println("-- Props Updated --");
        Samsung.display();

        // Create a Second Monitor
        Monitor BenQ = new Monitor("Red", "40 inch", "3840x2160");

        // Compare the 2 Monitors created
        System.out.println("-- Monitor #1 --");
        Samsung.display();
        System.out.println("-- Monitor #2 --");
        BenQ.display();

        // Create 3 universities with some students
        // University #1
        University UTM = new University("UTM", 1980);
        UTM.students.add(new Student("Iurie", 20, 10));
        UTM.students.add(new Student("Fish", 20, 10));
        UTM.students.add(new Student("John", 20, 10));

        // University #2
        University USM = new University("USM", 1978);
        USM.students.add(new Student("Beluga", 18, 9));
        USM.students.add(new Student("Skittle", 21, 10));
        USM.students.add(new Student("Hecker", 19, 10));

        // University #3
        University ULIM = new University("ULIM", 1989);
        ULIM.students.add(new Student("Lester", 20, 10));
        ULIM.students.add(new Student("Clay", 19, 9));
        ULIM.students.add(new Student("Alex", 20, 10));

        // Display Info About Universities and the Average Mean
        UTM.getUniversity();
        System.out.println("The Average Mean: " + UTM.getMean());

        USM.getUniversity();
        System.out.println("The Average Mean: " + USM.getMean());

        ULIM.getUniversity();
        System.out.println("The Average Mean: " + ULIM.getMean());
    }
}


