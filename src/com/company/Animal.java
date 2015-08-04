package com.company;

import java.util.ArrayList;


/**
 * Created by foscraig on 8/4/15.
 */
public class Animal {
    public String sound;
    public String name;
    public ArrayList<String> allowedAnimals = new ArrayList<String>(){{
        add("com.company.Cat");
        add("com.company.Dog");
        add("com.company.Giraffe");
    }};

    public Animal(String s, String n)
    {
        this();
        this.sound=s;
        this.name=n;
        /*public void classTest() throws RuntimeException {
           try {
                if (this instanceof com.company.Cat) {
                    System.out.println("something");
                } else {
                    throw RuntimeException;
                }
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        }
        classTest();*/
    }

    public Animal()
    {
        if (allowedAnimals.contains(this.getClass().getName()))
        {
            System.out.println("I am an allowed animal!");

        }
        else
        {
            throw new RuntimeException("Class " + this.getClass().toString() + " not allowed." );
        }
    }

    String getSound()
    {
        return this.sound;
    }

    String titleSound() {
        return this.getSound().substring(0, 1).toUpperCase() + this.getSound().substring(1);
    }

    void speak()
    {
       System.out.println(this.name + " says " + this.getSound());
    }

    static String getAllowedAnimals()
    {
        return "Allowed animals: Dog, Cat";
    }
}
