package com.BridgeLabz.day5.Basic;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year= scn.nextInt();
        //System.out.println(year);
        if ( year>=1000 && year<=9999) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }

        else {
            System.out.println("Enter correct year");
        }
    }
}
