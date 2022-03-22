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
        outputQuestionsAndAnswersXTimes(0, questions, answers);
        System.out.println(sum(10, 13));
    }

    public static void outputQuestionsAndAnswersXTimes(int x,
                                                       ArrayList<String> questions,
                                                       ArrayList<String> answers) {
        for(int y = 0; y < x; y++) {
            for (int i = 0; i < questions.size(); i++) {
                System.out.println(questions.get(i));
                System.out.println(answers.get(i));
            }
        }
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
