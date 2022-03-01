package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
            triangle += TriangleUtilities.getRow(i) + "\n";
        }return triangle;
    }

    public static String getRow(int numberOfStars) {
        String stars = "";

        for (int i = 1; i <= numberOfStars; i++) {
            stars = stars + "*";
        }
        return stars;}

    public static String getSmallTriangle() {
        return TriangleUtilities.getTriangle(4);
    }

    public static String getLargeTriangle() {
        return TriangleUtilities.getTriangle(10);
    }
}
