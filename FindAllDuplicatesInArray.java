package com.Ankur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllDuplicatesInArray {
    //https://leetcode.com/problems/find-all-duplicates-in-an-array/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> response = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {  //Swap with the correct index
                int tmp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = tmp;
            } else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1)
                response.add(arr[j]);
        }
        return response;
    }
}
