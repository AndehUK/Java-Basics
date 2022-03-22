package net.andeh;

public class Main {

    public static void main(String[] args) {

        //Using the "Default Constructor"
        Dog doggo = new Dog();
        System.out.println(doggo.name);

        Dog tilly = new Dog("image", "Tilly", 7);
        System.out.println(tilly.name);
        System.out.println(tilly.getAge()); //We use getAge() rather than .age because .age is private

        Dog biscuit = new Dog("image", "Biscuit", 8);
        Dog.outputDog(biscuit);

        tilly.woof();
        biscuit.woof();

        System.out.println("Tilly is " + tilly.getAgeInHumanYears() + " years old in human years!");
    }
}
