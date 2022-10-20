package com.line.comparison;

import java.util.Scanner;

public class LineComparisonComputation {
    //Default Constructor.
    public LineComparisonComputation() {
        System.out.println("Welcome to Line Comparison Computation Program");
    }

    public static void main(String[] args) {

        //Initialize the object.
        LineComparisonComputation line = new LineComparisonComputation();

        Scanner scan = new Scanner(System.in);
        String s1 = "Line 1";
        String s2 = "Line 2";
        String l1 = Double.toString(setLines(scan,s1));
        System.out.println();
        String l2 = Double.toString(setLines(scan,s2));
        checkEquality(l1,l2);

    }

    //Setting values for lines.
    public static double setLines(Scanner scan, String s) {
        System.out.println("Enter "+s+" End Points:-");

        //Declaring the variables.
        System.out.print("Enter First Co-ordinates(x1,y1): \n");
        double x1= scan.nextDouble();
        double y1= scan.nextDouble();
        System.out.printf("First Co-ordinates (x1= %g , y1= %g)%n",x1,y1);
        System.out.print("Enter Second Co-ordinates(x2,y2): \n");
        double x2= scan.nextDouble();
        double y2= scan.nextDouble();
        System.out.printf("Second Co-ordinates (x2= %g , y2= %g)%n",x2,y2);
        double length = getLength(x1,x2,y1,y2,s);
        return length;
    }

    //Getting length of the line.
    public static double getLength(double x1, double x2, double y1, double y2, String s) {
        double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double length = (double)Math.sqrt(a);
        System.out.println();
        System.out.println("Length of "+s+" is : "+length);
        return length;
    }

    //Checking if both are equals or not
    public static void checkEquality(String l1, String l2) {
        boolean equal = l1.equals(l2);
        System.out.println("Equality of two lines using Java equals method is : "+equal);
    }

}

