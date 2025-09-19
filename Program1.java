package com.assignmengt;

import java.util.Scanner;

public class Program1 {
    int calculate(int a, int b, String op) {
        switch (op) {
            case "add": return a + b;
            case "sub": return a - b;
            case "mul": return a * b;
            case "div":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Division by zero not allowed");
                    return 0;
                }
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();

        Program1 calc = new Program1();
        System.out.println("Result: " + calc.calculate(a, b, op));
    }
}
