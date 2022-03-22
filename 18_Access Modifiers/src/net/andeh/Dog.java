package net.andeh;

public class Dog {

    //Fields within the dog class (like self.var in py)
    public String picture; //Means it can be used anywhere
    protected String name; //Means it can only be used inside the package
    private int age; //Means it can only be used inside the class, not outside
    public static final int dogToHumanYearMultiplier = 7; //Static means it belongs to the class, and will not be part of the constructor
                                                          //Final means the value will not change once it has been assigned a value

    //getter
    public int getAge() {
        return age;
    }
    //Default Constructor
    public Dog() {

    }

    //To create a new Object, we need a Custom Constructor
    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    //Basic method that can be used by objects using this class
    public void woof() {
        System.out.println(this.name + " just woofed!");
    }

    public void birthday() {
        this.age++;
    }

    public int getAgeInHumanYears() {
        return this.age * Dog.dogToHumanYearMultiplier;
    }

    public static void outputDog(Dog dog) {
        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}
