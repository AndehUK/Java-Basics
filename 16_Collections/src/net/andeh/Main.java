package net.andeh;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Base way of creating an array that contains only strings and has a size of 2
        String[] questions = new String[2];
        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the Capital of the United Kingdom?";

        //Lists allow you to add entries dynamically and don't need a length specifying
        List<String> questionsList = new ArrayList<>();
        questionsList.add("What Language is spoke in Germany?");
        questionsList.add("What is the Capital of Canada?");
        questionsList.add("In what Hemisphere is Brazil?");

        // map a Key to a certain Value. Called Key-Value Pairs (dictionary but not)
        Map<String, String> CountryToCapital = new HashMap<>();
        CountryToCapital.put("Germany", "Berlin");
        CountryToCapital.put("France", "Paris");
        CountryToCapital.put("Italy", "Rome");
        CountryToCapital.put("USA", "Washington DC");

        //Sets are a collection that doesn't contain duplicates
        Set<String> usernames = new HashSet<>();
        usernames.add("Andeh");
        usernames.add("Andeh");
        usernames.add("Deez");
        //If printed, this would only display andeh once
    }
}
