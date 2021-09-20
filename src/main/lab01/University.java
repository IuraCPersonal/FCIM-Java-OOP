package main.lab01;

import java.util.List;
import java.util.ArrayList;

// The University Class

public class University {

    public String name;
    public int foundationYear;
    public List<Student> students;

    University(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = new ArrayList<>();
    }

    public void getUniversity() {
        System.out.println(" --" + this.name + " -- ");
        System.out.println("Foundation Year: " + this.foundationYear);
        System.out.print("Students: ");
        for (Student student : this.students) {
            System.out.print(student.name + " ");
        }
        System.out.println();
    }

    public double getMean() {
        double mean = 0;

        for (Student student : this.students) {
            mean += student.mark;
        }

        return mean / this.students.toArray().length;
    }
}

