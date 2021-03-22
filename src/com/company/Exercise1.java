package com.company;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        exerciseOne();
    }

    public static void exerciseOne(){
        System.out.println("Ingrese número máximo a evaluar:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for(int i =0; i<=number; i++){
            if(isEven(i)){
                System.out.println(i + " es par :)");
            }
        }
    }

    public static boolean isEven(int numberToEvaluate){
        return numberToEvaluate % 2 == 0;
    }
}
