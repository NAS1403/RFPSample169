package com.BridgeLabz.day5.Basic;
import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter two number to swap");
        int N1 = scr.nextInt();
        int N2 = scr.nextInt();
        System.out.println("Numbers before swaping are:");
        System.out.println("N1= "+ N1);
        System.out.println("N2= "+ N2);
        int temp = N1;
        N1 = N2;
        N2 = temp;
        System.out.println("Numbers after swaping are:");
        System.out.println("N1= "+ N1);
        System.out.println("N2= "+ N2);
    }
}
