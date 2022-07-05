package com.bridgelabz.basics;

public class SumExample {
    static void sum(){
        int x = 10;
        int y = 20;
        int sum = x+y;
        System.out.println("Sum = " + sum);
    }
    static int multiply(int x, int y){
        //int product = x*y;
        return x*y;
    }

    static void divide(){
        double answer = (double)3/(double)4;
        System.out.println("Answer = " + answer);
    }

    public static void main(String[] args) {

            int a=multiply(4,7);
            sum();
            divide();
            int result = multiply(a,3);
            System.out.println("Result = " + result);
            int result2 = multiply(5,6);
            System.out.println("Result = " + result2);
    }
}
