package com.mycompany.codewars;

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int catYears;
        int dogYears;

        if (humanYears == 1) {
            catYears = 15;
        } else if (humanYears == 2) {
            catYears = 24;
        } else {
            catYears = 24 + 4 * (humanYears - 2);
        }

        if (humanYears == 1) {
            dogYears = 15;
        } else if (humanYears == 2) {
            dogYears = 24;
        } else {
            dogYears = 24 + 5 * (humanYears - 2);
        }

        return new int[]{humanYears, catYears, dogYears};
    }

}
