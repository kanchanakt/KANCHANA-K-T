package com.assignmengt;

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int n : arr) {
                if (n % i == 0) count++;
            }
            map.put(i, count);
        }
        
        System.out.println(map);
    }
}
