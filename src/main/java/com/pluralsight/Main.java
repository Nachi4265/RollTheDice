package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //Creation of Dice
        Dice dice = new Dice();


        //Int for roll variables
        int roll1;
        int roll2;

        //Counters for number 2,4,6,7(weird choice of numbers)
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        //For loop that executes 100 times
        int i = 0;

        while(i>=100){
            roll1 = dice.roll();
            roll2 = dice.roll();
            i++;
        }


    }
}