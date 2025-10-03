package com.pluralsight;

public class Dice {

    //A Method that rolls the "Dice" and outputs a random number from 6-1
    public int roll (){
        int randomNumber = (int)(Math.random()* 6)+1;
        return randomNumber;
    }

}

