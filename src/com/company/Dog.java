package com.company;
import com.company.Animal;
/**
 * Created by foscraig on 8/4/15.
 */
public class Dog extends Animal
{
    public Dog()
    {
        super("voff","Dog");
    }
    void bark()
    {
        System.out.println(this.titleSound()+", "+this.getSound());
    }

}
