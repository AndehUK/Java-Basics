package net.andeh;

public class Main {

    public static void main(String[] args) {
        int x = 100;
        int y = 20;

        //Addition
        int result = x + y;
        System.out.println(result);

        //Subtraction
        //You don't need to specify the data type of the variable this time because it is already defined as an int var
        result = x - y;
        System.out.println(result);

        //Multiplication
        result = x * y;
        System.out.println(result);

        //Division
        result = x / y;
        System.out.println(result);

        //Remainder
        result = x % y;
        System.out.println(result);


        //Math Methods
        System.out.println(Math.max(x, y)); //Highest number
        System.out.println(Math.min(x, y)); //Lowest Number
        System.out.println(Math.abs(-500)); //Absolute value
    }
}
