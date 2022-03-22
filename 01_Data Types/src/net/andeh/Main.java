package net.andeh;

public class Main {

    public static void main(String[] args) {
        int number = 42;    //Integer (whole number) (-2,147,483,648 to 2,147,483,647)
        float fnumber = 13.37f; //Floating point number [7 decimal point precision]
        double dnumber = 420.0005; //Double number [15 decimal point precision] (Can write either "d" or "f", defaults to "d")

        byte bnumber = 100;     //One byte (or 8 bits) (-128 to 127)
        short snumber = 30000;  //Short (-32,768 to 32,767)
        long lnumber = 5000000; //Long (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)

        boolean truers = true;  //Boolean value of true (1)
        boolean cap = false;    //Boolean value of false (0)

        char lonely = 'A';  //Stores a single character. Can also include punctuation. Must use single quotes.

        String message = "Hello World!";    //Stores a sequence of characters.
        String empty = null;                //Null is not 0 (not the same as false), it is literally empty with no value
    }
}
