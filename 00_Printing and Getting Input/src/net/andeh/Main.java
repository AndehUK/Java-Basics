package net.andeh;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World"); //Printing to console
        int x = 10; //Assigning a value to a integer variable
        System.out.println("The number is: " + x); //Printing a variable's value

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your username!");
        String input = scanner.nextLine();

        System.out.println("Your username is: " + input);
    }
}
