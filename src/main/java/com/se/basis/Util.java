package com.se.basis;

public class Util {

    public static int countNumbersInRange(int[] data, int lowLimit, int upperLimit) {
        int count, i;
        count = 0; // 1

        if (lowLimit <= upperLimit) {
            i = 0;
            while (i < data.length) {
                if (data[i] <= upperLimit && data[i] >= lowLimit)
                    ++count;
                i++;
            }
        }
        return count;
    }

}
