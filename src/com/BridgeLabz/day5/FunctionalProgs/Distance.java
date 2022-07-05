package com.BridgeLabz.day5.FunctionalProgs;
import java.lang.Math;
import java.util.Scanner;

public class Distance {

    static void LineDistance(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of x and y:");
        int x = scn.nextInt();
        int y = scn.nextInt();
        double distance  = Math.sqrt(x*x+y*y);
        System.out.println("Distance between (" + x + "," + y + ") and (0,0) is " + distance);
    }
    public static void main(String[] args) {
        LineDistance();
    }
}
