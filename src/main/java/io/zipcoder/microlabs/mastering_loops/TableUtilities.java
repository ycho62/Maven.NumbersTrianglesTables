package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {return TableUtilities.getMultiplicationTable(4);}

    public static String getLargeMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(9);
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for (int x = 1; x <= tableSize; x++) {
            for (int y = 1; y <= tableSize; y++) {
                table += String.format("%3d |",x*y);
            }
            table += "\n" ;

        }return table;
    }
}

