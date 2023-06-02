package com.mycompany.codewars;

public class CodeWarsMath {

    public static int nearestSq(final int n) {

        int nUpwards = n;

        int nDownwards = n;

        while (Math.sqrt(nUpwards) % 1 != 0) {
            nUpwards++;
        }

        while (Math.sqrt(nDownwards) % 1 != 0) {
            nDownwards--;
        }

        if (nUpwards - n < n - nDownwards) {
            return nUpwards;
        } else if (nUpwards - n > n - nDownwards) {
            return nDownwards;
        }
        return n;
    }

}
