package main.lab04;
import main.lab02.Queue;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    static Boolean checkPair(String c1, String c2) {
        return Objects.equals(c1, "(") && Objects.equals(c2, ")");
    }

    static Boolean checkBalance(String expression) throws Exception {
        Queue<String> q = new Queue<String>();

        for (int i = 0; i < expression.length(); ++i) {
            if (expression.charAt(i) == '(') {
                q.add(String.valueOf(expression.charAt(i)));
            }
            if (expression.charAt(i) == ')') {

                if (q.getLength() == 0) {
                    return false;
                }
                else if (!checkPair(q.pop(), String.valueOf(expression.charAt(i)))) {
                    return false;
                }
            }
        }
        System.out.println(q.getLength());
        return q.getLength() == 0;
    }

    public static void main(String []args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expr = sc.nextLine();

        if (checkBalance(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }

    }

}
