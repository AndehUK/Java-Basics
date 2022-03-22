package net.andeh;

public abstract class Animal { //Abstract stops this you from creating an object of type animal.
    public String picture;
    protected String name;
    protected int age;

    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void birthday() {
        this.age++;
    }

    public abstract void makeSound(); //Every sub-class must implement this method.
}
