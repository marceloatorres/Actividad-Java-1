package com.company;

import java.util.Scanner;

public class Exercise2 {
    private static int maxNumber;

    public static void main(String[] args) {
        exerciseTwo();
    }

    public static void exerciseTwo(){
        System.out.println("Ingrese número máximo a evaluar:");
        Scanner scan = new Scanner(System.in);
        maxNumber = scan.nextInt();
        for(int i =1; i <= maxNumber; i++){
            if(isMultiple(i)){
                System.out.println(i + " es múltiplo de " + maxNumber + ":)");
            }
        }
    }
    public static boolean isMultiple(int numberToEvaluate){
        return maxNumber%numberToEvaluate == 0;
    }
}
