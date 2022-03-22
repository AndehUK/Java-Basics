package net.andeh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> questions = new ArrayList<String>();
        questions.add("How many States does the USA have?");
        questions.add("What is the Capital of the United Kingdom?");
        questions.add("What is the chemical symbol for Iron?");
        questions.add("How High is Mount Everest? (Answer in km)");
        questions.add("What is the Answer to Life, the Universe and Everything?");

        ArrayList<String> answers = new ArrayList<String>();
        answers.add("50");
        answers.add("London");
        answers.add("Fe");
        answers.add("8848");
        answers.add("42");

        Scanner scanner = new Scanner(System.in);
        int points = 0;

        while (true) {
            printTitle();

            for(int i = 0; i < questions.size(); i++) {
                printQuestion(questions.get(i));
                String userAnswer = scanner.next();

                if(isCorrectAnswer(userAnswer, answers.get(i))) {
                    printYouHadCorrect();
                    points = increasePointTotal(points);
                    printCurrentPoints(points);
                } else {
                    printYouHadCorrect();
                    printTheCorrectAnswer(answers.get(i));
                }
            }

            printPointTotal(points);
            printPlayAgain();
            if(scanner.next().equals("Y")) {
                points = 0;
                continue;
            } else {
                break;
            }
        }
        printGoodbye();
    }

    public static void printTitle() {
        System.out.println("TRIVIA WITH JAVA");
    }

    public static int increasePointTotal(int points) {
        return points + 1;
    }

    public static void printCurrentPoints(int points) {
        System.out.println("You currently have " + points + " points!");
    }

    public static void printPlayAgain() {
        System.out.println("Do you want to play again? (Y/N)");
    }

    public static void printPointTotal(int points) {
        System.out.println("You had " + points + " points!");
    }

    public static void printGoodbye() {
        System.out.println("Thank you for playing Trivia with Java!");
    }

    public static void printQuestion(String question) {
        System.out.println(question);
    }

    public static boolean isCorrectAnswer(String userAnswer, String realAnswer) {
        return userAnswer.equals(realAnswer);
    }

    public static void printYouHadCorrect() {
        System.out.println("That was the correct answer!");
    }

    public static void printYouHadIncorrect() {
        System.out.println("That was the incorrect answer!");
    }

    public static void printTheCorrectAnswer(String realAnswer) {
        System.out.println("The correct answer was " + realAnswer);
    }
}
