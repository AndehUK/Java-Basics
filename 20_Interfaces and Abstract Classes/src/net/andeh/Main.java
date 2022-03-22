package net.andeh;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dog tilly = new Dog("image", "Tilly", 5);
        Cat itchy = new Cat("image", "Itchy", 5);

        tilly.birthday();

        tilly.makeSound();
        itchy.makeSound();

        List<Animal> animals = new ArrayList<>();
        animals.add(tilly);
        animals.add(itchy);

        System.out.println(animals.get(1).name);

        Animal birb = new Bird("image", "Birb", 5);
        birb.makeSound();

        List<IPettable> pets = new ArrayList<>();
        pets.add(tilly);
        pets.add(itchy);
        //pets.add(birb); This won't work because the Animal class isn't of IPettable
        //You also cannot cast to an Interface

        for(IPettable pet : pets) {
            pet.pet();
        }
    }
}
