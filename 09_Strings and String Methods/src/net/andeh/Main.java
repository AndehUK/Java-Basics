package net.andeh;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String sentence = "Java ain't the best language";
        System.out.println(sentence);

        System.out.println("The length of the sentence is: " + sentence.length()); //Gives the length of the string
        System.out.println("Shouting: " + sentence.toUpperCase()); //Converts string to all upper case
        System.out.println("Whispering: " + sentence.toLowerCase()); //Converts string to all lower case

        System.out.println("The word 'Java' is found at position: " + sentence.indexOf("Java")); //Returns position of a sequence inside the string
        System.out.println("The character at position 10 is: " + sentence.charAt(10)); //Returns the character at a given position

        System.out.println(sentence.replace("Java", "C#")); //Replaces an instance in the string with a different value

        String s = "";
        System.out.println("Is variable 's' empty: " + s.isEmpty()); //Returns a bool for whether the string is empty or not

        System.out.println(sentence.startsWith("J")); //Returns a bool depending on what the string starts with
        System.out.println(sentence.endsWith("e")); //Returns a bool depending on what the string ends with
        System.out.println(sentence.contains("Java")); //Returns a bool depending on if the sequence provided is in the string

        System.out.println(sentence.substring(17));
    }
}
