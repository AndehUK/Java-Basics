package net.andeh;

import net.andeh.banking.*;

public class Main {

    public static void main(String[] args) {
        Person nano = new Person("Nano", "Attack", 8);
        Person daniel = new Person("Daniel", "Smith", 24);
        Person marie = new Person("Marie", "Susan", "Jones", 28);

        Bank ab = new Bank("AndehBank");
        ab.openBankAccount(nano, 200); //Not old enough

        ab.openBankAccount(marie, 2000);
        ab.openBankAccount(daniel, 10);

        System.out.println(ab.getAccountByPerson(marie).getBalance());
        ab.withdrawAmount(3000, marie);
    }
}
