package net.andeh;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Dog tilly = new Dog("image", "Tilly", 7);
        Dog biscuit = new Dog("image", "Biscuit", 5);

        tilly.birthday();

        Cat itchy = new Cat("image", "Itchy", 6);

        tilly.makeSound();
        itchy.makeSound();

        List<Animal> animals = new ArrayList<>();
        animals.add(tilly);
        animals.add(biscuit);
        animals.add(itchy);

        animals.get(1).makeSound();

        Animal animal = new Cat("image", "Scratchy", 6);
        animal.makeSound();
    }
}
