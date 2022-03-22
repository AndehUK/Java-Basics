package net.andeh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String questionOne = "How many States does the USA have?";
        String questionTwo = "What is the Capital of the United Kingdom?";
        String questionThree = "What is the chemical symbol for Iron?";

        int answerOne = 50;
        String answerTwo = "London";
        String answerThree = "Fe";

        int points = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println(questionOne);
        int userInputOne = scanner.nextInt();

        if(userInputOne == answerOne) {
            points++;
            System.out.println("Correct! The USA has 50 states.");
        } else {
            System.out.println("Incorrect! The USA has 50 states.");
        }

        System.out.println("\n" + questionTwo);
        String userInputTwo = scanner.next();

        if(userInputTwo.equals(answerTwo)) {
            points++;
            System.out.println("Correct! The capital of the United Kingdom is London.");
        } else {
            System.out.println("Incorrect! The capital of the United Kingdom is London.");
        }

        System.out.println("\n" + questionThree);
        String userInputThree = scanner.next();

        if(userInputThree.equals(answerThree)) {
            points++;
            System.out.println("Correct! The checmical symbol for iron is Fe.");
        } else {
            System.out.println("Incorrect! The checmical symbol for iron is Fe.");
        }

        String prefix = "Game over! You got ";
        switch (points) {
            case 0: System.out.println(prefix + "0 points! You need to get some practise in!"); break;
            case 1: System.out.println(prefix + "1 point! Better luck next time."); break;
            case 2: System.out.println(prefix + "2 points! Almost there, you got this!"); break;
            case 3: System.out.println(prefix + "3 points!! That's full marks! Pure genius."); break;
            default: System.out.println("I have no clue how you didn't get between 0-3, tell me your secrets!"); break;
        }
    }
}
