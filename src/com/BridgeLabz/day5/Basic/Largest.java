package com.BridgeLabz.day5.Basic;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int N1 = scr.nextInt();
        int N2 = scr.nextInt();
        int N3 = scr.nextInt();
        if (N1>N2 && N1>N3){
            System.out.println(N1 + " is the largest number");
        }
        else if (N2>N1 && N2>N3){
            System.out.println(N2 + " is the largest number");
        }
        else{
            System.out.println(N3 + " is the largest number");
        }

    }
}
