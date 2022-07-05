package com.BridgeLabz.day5.Basic;
import java.util.Scanner;

public class Powerof2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = scn.nextInt();
        //System.out.println(N);
        if (N>=0 && N<31){
            for (int i=1;i<=N;i++){
                System.out.println("2 * " + i +" = " +(2*i));
            }
        }
        else{
            System.out.println("Overflow");
        }

        }

}
