package com.company;

import java.util.Scanner;

public class Exercise4 {
    private static int maxNumber;
    private static int auxNumberToEvaluate;

    public static void main(String[] args) {
        exerciseFour();
    }

    public static void exerciseFour(){
        System.out.println("Ingrese número a evaluar:");
        Scanner scan = new Scanner(System.in);
        maxNumber = scan.nextInt();
        for(int i = 1; i <= maxNumber; i++){
            auxNumberToEvaluate = i;
            if(isPrime(i - 1)) {
                System.out.println(i + " es primo! :)");
            }else{
                System.out.println(i + " no es primo! :(");
            }
        }
    }

    public static boolean isPrime(int numberToEvaluate){
        if(numberToEvaluate <= 1)
            return true;

        if(auxNumberToEvaluate%numberToEvaluate==0)
            return false;

        return isPrime(numberToEvaluate-1);
    }
}
