package com.pluralsight.domain;

import com.pluralsight.interfaces.IAnimal;
import com.pluralsight.interfaces.IFlyable;
import com.pluralsight.interfaces.Swimmable;

public class Dog implements IAnimal, IFlyable, Swimmable {

    @Override
    public void makeSound() {
        System.out.println("Woof!");

    }

    @Override
    public void Fly() {
        System.out.println("Even Django can fly");
    }

    @Override
    public void swim() {

    }
}
