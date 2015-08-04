package com.company;

/**
 * Created by foscraig on 8/4/15.
 */
public class Giraffe extends Animal {
    public Giraffe()
    {
        super("neeeee","Giraffe");

    }
    void miao()
    {
        System.out.println(this.titleSound()+", "+this.getSound());
    }
}
