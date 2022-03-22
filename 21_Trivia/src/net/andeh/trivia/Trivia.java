package net.andeh.trivia;

public class Trivia {
    public String question;
    public String answer;

    public Trivia(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public boolean isCorrectAnswer(String input) {
        return this.answer.toLowerCase().equals(input.toLowerCase());
    }

    public void printQuestion() {
        System.out.println(question);
    }

    public void printAnswer() {
        System.out.println(answer);
    }

    public boolean validateAnswer(String input) {
        boolean valid = isCorrectAnswer(input);

        if(valid) {
            printCorrect();
        } else {
            printIncorrect();
            printCorrectAnswer();
        }
        return valid;
    }

    private void printCorrect() {
        System.out.println("That was the correct answer!");
    }

    private void printIncorrect() {
        System.out.println("That was the incorrect answer!");
    }

    private void printCorrectAnswer() {
        System.out.println("The correct answer was " + this.answer);
    }
}
