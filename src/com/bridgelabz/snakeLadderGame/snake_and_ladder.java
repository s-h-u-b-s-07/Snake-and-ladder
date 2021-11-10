package com.bridgelabz.snakeLadderGame;

public class snake_and_ladder {
    public static void main(String[] args) {
        //Taking position variable for starting position and assign it zero
        int position = 0;

        //Taking diceRollCount variable for number of dice play
        int diceRollCount = 0;

        System.out.println("position is " + position);

        //Taking diceValue variable for dice number by using random
        int diceValue = (int) (Math.random() * 10) % 6 + 1;

        //calling the class Utility
        Utility utility = new Utility();
        utility.playOption(position, diceValue, diceRollCount);

    }
}

class Utility {

    public void playOption(int position, int diceValue, int diceRollCount) {

        //computation
        while (position <= 99) {

            int optionValue = (int) (Math.random() * 10) % 3 + 1;
            diceRollCount++;

            switch (optionValue) {
                case 1:
                    System.out.println("No Play....You are in the same position");
                    break;

                case 2:
                    position = (position + diceValue);
                    if (position > 100) {
                        position = (position - diceValue);
                        continue;
                    }
                    System.out.println("your position after ladder is :" + position);
                    break;

                case 3:
                    position = (position - diceValue);

                    if (position < 0) {
                        position = 0;
                    }
                    System.out.println("Your Position after snake is" + position);
                    break;
            }
        }
        System.out.println("dice play number:: " + diceRollCount);
    }
}
