package net.andeh;

public class Main {

    public static void main(String[] args) {
        int exam1 = 31;
        int exam2 = 51;

        if(exam1 >= 50) {
            System.out.println("You have passed the first exam!");
        } else {
            System.out.println("You didn't pass the first exam!");
        }

        if(exam2 >= 50) {
            System.out.println("You have passed the second exam!");
        } else if(exam2 < 0){
            System.out.println("How did you get negative points??");
        } else {
            System.out.println("You didn't pass the second exam.");
        }
    }
}
