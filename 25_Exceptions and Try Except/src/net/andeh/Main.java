package net.andeh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int z = scanner.nextInt();

        try {
            checkForZero(z);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }

        System.out.println("This happens always");

    }

    private static void checkForZero(int number) throws TestException{
        if(number == 0) {
            throw new TestException("NUMBER IS ZERO");
        }
    }
}
