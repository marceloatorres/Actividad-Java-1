package com.company;

import java.util.Scanner;

public class Exercise3 {
    private static int maxNumber;

    public static void main(String[] args) {
        exerciseThree();
    }

    public static void exerciseThree(){
        System.out.println("Ingrese número a evaluar:");
        Scanner scan = new Scanner(System.in);
        maxNumber = scan.nextInt();
        if(isPrime(maxNumber - 1)) {
            System.out.println(maxNumber + " es primo! :)");
        }else{
            System.out.println(maxNumber + " no es primo! :(");
        }
    }

    public static boolean isPrime(int numberToEvaluate){
        if(numberToEvaluate <= 1)
            return true;

        if(maxNumber%numberToEvaluate==0)
            return false;

        return isPrime(numberToEvaluate-1);
    }
}
