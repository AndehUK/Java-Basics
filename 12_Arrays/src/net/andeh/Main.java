package net.andeh;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String questionOne = "How many states does the USA have?";
        String questionTwo = "What is the Capital of the United Kingdom";
        String questionThree = "What is the chemical symbol for Iron";

        String answerOne = "50";
        String answerTwo = "London";
        String answerThree = "Fe";

        ArrayList<String> questions = new ArrayList<String>();
        questions.add(questionOne);
        questions.add(questionTwo);
        questions.add(questionThree);

        ArrayList<String> answers = new ArrayList<String>();
        answers.add(answerOne);
        answers.add(answerTwo);
        answers.add(answerThree);
        answers.add(0, "val");
        answers.remove(0);

        System.out.println(questions.get(0));
        System.out.println(answers);
    }
}
