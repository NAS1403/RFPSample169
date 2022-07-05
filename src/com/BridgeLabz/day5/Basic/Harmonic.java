package com.BridgeLabz.day5.Basic;
import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of N");
        double N = scn.nextInt();
        double H=0.0;
        if (N>0){
            for (double i=1.0;i<=N;i++){
                H = H+(1/i);
            }
            System.out.println(H);
        }
        else{
            System.out.println("Enter positive number");
        }
    }
}
