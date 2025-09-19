package com.assignmengt;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            for (int i = 1; i < n; i++) {
                System.out.print((2 * i - 1) + ", ");
            }
            System.out.print(2 * n - 1);
        }
    }
}
