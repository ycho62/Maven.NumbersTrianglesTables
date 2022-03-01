package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String s = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0)
                s = s + i;
        }
        return s;
    }


    public static String getOddNumbers(int start, int stop) {
        String s = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0)
                s = s + i;
        }
        return s;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int start) {
        return NumberUtilities.getRange(0, 1, 1);
    }

    public static String getRange(int start, int stop) {
        return NumberUtilities.getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i = 1 + step) {
            result += 1;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i < stop; i = 1 + step) {
            result = result + Math.round(Math.pow(i, exponent));

        }
        return result;
    }
}
