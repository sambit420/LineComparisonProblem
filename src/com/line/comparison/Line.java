package com.line.comparison;

import java.util.Scanner;

public class Line {
    //Declaring Variables.
    private double x1,x2,y1,y2;

    //Creating parameterized constructor
    public Line(Scanner scan) {
        System.out.println("Enter both X and Y co-ordinates for the line.");
        System.out.print("Enter First Co-ordinates(x1,y1): \n");
        this.x1 = scan.nextDouble();
        this.y1 = scan.nextDouble();
        System.out.printf("First Co-ordinates (x1= %g , y1= %g)%n",x1,y1);
        System.out.print("Enter Second Co-ordinates(x2,y2): \n");
        this.x2 = scan.nextDouble();
        this.y2 = scan.nextDouble();
        System.out.printf("Second Co-ordinates (x2= %g , y2= %g)%n",x2,y2);
    }

    //Method to calculate length.
    public double calculateLength()
    {
        double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double length = (double)Math.sqrt(a);
        return length;
    }
}
