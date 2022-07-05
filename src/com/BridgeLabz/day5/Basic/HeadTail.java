package com.BridgeLabz.day5.Basic;
import java.lang.Math;
import java.util.Scanner;

public class HeadTail {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of times to flip a coin:");
        float n = scn.nextInt();
        int H=0;
        int T=0;
        if ( n>0 ) {
            for (int i=0;i<n;i++) {
                double value = Math.random() % 2;
                if (value < 0.5) {
                    //System.out.println("Tails");
                    T++;
                } else {
                    //System.out.println("Heads");
                    H++;
                }
            }
            double TailPercent=(T*100)/n;
            double HeadPercent=(H*100)/n;
            System.out.println("Percentage of Tail is - " +TailPercent);
            System.out.println("Percentage of Head is - " +HeadPercent);
        }
        else{
            System.out.println("Please enter positive number");
        }
    }
}
