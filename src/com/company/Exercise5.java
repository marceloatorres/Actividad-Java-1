package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        exerciseFive();
    }

    public static void exerciseFive(){
        System.out.println("Ingrese cantidad de numeros a mostrar:");
        Scanner scan = new Scanner(System.in);
        int numbersToShowCount = scan.nextInt();
        System.out.println("Ingrese cantidad de repeticiones:");
        int repetitions = scan.nextInt();
        System.out.println("Ingrese el número que se tiene que repetir:");
        int numberToRepeat = scan.nextInt();

        String stringToEvaluate = generateString(repetitions,numberToRepeat);
        int goals = 0;
        Integer count = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();

        while (goals < numbersToShowCount){
            if(count.toString().contains(stringToEvaluate)){
                result.add(count);
                goals++;
            }
            count++;
        }

        System.out.println("Resultado:");

        for (int i = 0 ; i < result.stream().count(); i++){
            System.out.println(result.get(i));
        }

    }

    public static String generateString(int repetitios, Integer numberToRepeat){
        String aux = "";
        for(int i = 0; i < repetitios; i++){
            aux += numberToRepeat.toString();
        }
        return  aux;
    }
}
