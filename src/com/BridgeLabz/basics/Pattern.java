package com.BridgeLabz.basics;

public class Pattern {
    public static void main(String[] args) {

        int n=3;

        for (int i=0;i<n;i++){
            for (int j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=n-1;j>i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
