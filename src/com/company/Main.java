package com.company;
import com.company.Animal;
import com.company.Cat;
import com.company.Dog;

public class Main {

    public static void main(String[] args) {

        System.out.println(Animal.getAllowedAnimals());

        Cat cat = new Cat();
        cat.speak();
        cat.miao();

        Dog dog = new Dog();
        dog.speak();
        dog.bark();

        Giraffe g = new Giraffe();
        g.speak();
        g.miao();

    }
}
