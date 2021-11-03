package com.bridgelabz.snakeLadderGame;

public class snake_and_ladder {
    public static void main(String[] args) {
        //Taking position variable for starting position and assign it zero
        int position = 0;
        System.out.println("WELCOME TO SNAKE AND LADDER PROGRAMME");
        System.out.println("You are at Starting Position::" + position);
        //calling a function Dice
        Dice();
    }

    public static void Dice(){

        //taking dice number by using random
        int diceCheck = (int) Math.floor(Math.random() * 10) % 6+1;
        System.out.println("Dice Value::"+ diceCheck);
    }
}
