package com.mycompany.codewars;

public class Solution {

    public static int century(int number) {

        double numberDouble = number;

        if (numberDouble % 100 == 0) {
            return number / 100;
        }

        return Math.round(number / 100) + 1;

    }

}
