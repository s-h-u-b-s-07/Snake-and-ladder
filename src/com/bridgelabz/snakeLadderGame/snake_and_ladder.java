package com.bridgelabz.snakeLadderGame;

public class snake_and_ladder {
    public static void main(String[] args) {
        //Taking position variable for starting position and assign it zero
        int position = 0;
        System.out.println("position is " + position);

        //Taking die variable for dice number by using random
        int die = (int) (Math.random() * 10) % 6 + 1;
        System.out.println("dice value is " + die);

        //Taking value variable by using random to compare with cases
        int value = (int) (Math.random() * 10) % 3 + 1;
        System.out.println("case number is " + value);

        //computation
        switch (value) {
            case 1:
                System.out.println("No Play You are in the same position.");
                break;

            case 2:
                position = (position + die);
                System.out.println("your position after ladder is ::" + position);
                break;

            case 3:
                position = (position - die);
                System.out.println("Your Position after snake is::" + position);
                break;
        }
    }
}
