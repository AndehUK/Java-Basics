package net.andeh;
import net.andeh.banking.*;

public class Main {

    public static void main(String[] args) {
	    Person andy = new Person("Andy", "Mason", 18);

        Person manager = new Person("John", "Smith", 42) {
            @Override
            public String getFullName() {
                return "Manager " + super.getFullName();
            }
        };

        System.out.println(manager.getFullName());
        System.out.println(andy.getFullName());
    }
}
