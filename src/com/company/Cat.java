package com.company;

/**
 * Created by foscraig on 8/4/15.
 */
public class Cat extends Animal {
    public Cat()
    {
        super("miao","Cat");

    }

    void miao()
    {
        System.out.println(this.titleSound());
    }
}
