package net.andeh;

public class Dog {

    //Fields within the dog class (like self.var in py)
    public String picture;
    public String name;
    public int age;

    //This allows us to create a new object with the Dog class
    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void woof() {
        System.out.println(this.name + " just woofed!");
    }



}
