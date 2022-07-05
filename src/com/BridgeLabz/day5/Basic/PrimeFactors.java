package com.BridgeLabz.day5.Basic;
import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {

            Scanner scr =new Scanner(System.in);
            System.out.println("Enter any Number  ");
            int N=scr.nextInt();

            System.out.println("Prime Factors are : " );
            for (int i = 2; i <= N; i++) {

                while (N % i == 0) {
                    System.out.println(i + " ");
                    N = N / i;
                }
            }
            if (N < 1) System.out.println(N);

        }

    }

