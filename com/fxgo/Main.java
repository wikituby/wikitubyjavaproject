package com.fxgo;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("Index\tCounter");
        int[] score = {30, 50, 70, 89, 97, 57, 32, 59, 431, 467, 876, 543, 90};

        // printing array objects against their index in a table
        for (int i = 0;i<score.length;i++){
            System.out.println(i + "\t"+"\t" + score[i]);

        }

        // adding and printing the sum of all array objects
        int sum = 0;

        for (int counter = 0;counter<score.length;counter++){
            sum += score[counter];

        }
        System.out.println("The sum of all the numbers is " + sum);

        // multiplying and printing the sum of all array objects
        int mult = 1;

        for (int counterMult = 0;counterMult<score.length;counterMult++){
            mult *= score[counterMult];

        }
        System.out.println("The sum of all the numbers is " + mult);

        //new change array list by adding 5, you can multiply or devide through by 5

        int[] score2 = {32, 59, 431, 467, 876, 543, 90};
        change(score2);

        for (int w:score2){
            System.out.println(w);

        }

    }

    public static void change(int x[]){
        for (int counter=0;counter< x.length;counter++){
            x[counter]+=5;
        }


    }



}

