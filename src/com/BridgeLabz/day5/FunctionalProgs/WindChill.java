package com.BridgeLabz.day5.FunctionalProgs;
import java.lang.Math;
import java.util.Scanner;

public class WindChill {
    static void Wind(){

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter temperature T and wind speed v");
        int T = scr.nextInt();
        int V = scr.nextInt();
        double W = 35.74+0.6215*T+(0.4275*T-35.75)*(Math.pow(V,0.16));
        System.out.println(W);
    }

    public static void main(String[] args) {
        Wind();
    }
}
