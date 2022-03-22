package net.andeh;

public class Main {

    public static void main(String[] args) {
        boolean truers = true;
        boolean cap = false;
        int score = 98;

        boolean passedClass = score >= 50;
        System.out.println("Passed: " + passedClass + " with " + score + " points!");

        boolean perfectScore = score == 100;
        System.out.println("Perfect score? " + perfectScore);

        boolean failedClass = perfectScore == false;


        // Logical Operators

        truers = true;
        cap = false;

        boolean megaTruers = truers && cap; //Both need to be true
        boolean kindaTruers = truers || cap; //Only 1 needs to be true
        boolean notTruers = !megaTruers; //Python equiv of "not megaTruers"
    }
}
