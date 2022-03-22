package net.andeh;

public class Bird extends Animal implements IPettable, IFly{

    public Bird(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " just chirped!");
    }

    @Override
    public void pet() {
        System.out.println("Petted " + this.name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + " flew!");
    }
}
