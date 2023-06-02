package com.mycompany.codewars;

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        int arr1sum = 0;
        int arr2sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1sum += arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2sum += arr2[i];
        }

        return arr1sum + arr2sum;

    }

}
