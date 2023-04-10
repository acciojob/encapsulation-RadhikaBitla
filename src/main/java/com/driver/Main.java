package com.driver;

public class Main
{
    public static void main(String[] args)
    {
        RWOnly rwOnly=new RWOnly();

        //when we try to access the name variable of classs RWOnly we get error, since we specified it as private.
        //and private properties can only be access within the class, and we are trying to access it from another class.

        //System.out.println(rwOnly.name);

        rwOnly.setName("Radhika");

        String value= rwOnly.getName();

        System.out.println(value);
    }
}