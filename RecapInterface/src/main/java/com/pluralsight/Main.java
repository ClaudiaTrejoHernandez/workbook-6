package com.pluralsight;

import com.pluralsight.domain.Bird;
import com.pluralsight.domain.Cat;
import com.pluralsight.domain.Dog;
import com.pluralsight.domain.Eagle;
import com.pluralsight.interfaces.IAnimal;
import com.pluralsight.interfaces.IFlyable;
import com.pluralsight.interfaces.Runnable;
import com.pluralsight.interfaces.Swimmable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Bird> birds = new ArrayList<>();
        birds.size();

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("First Dog ever");
        animals.removeLast();

        //LinkedList practice
        LinkedList<String> cart = new LinkedList<>();
        cart.addLast("Shoes");
        cart.removeLast();  //Undo last item
        //Faster functions (add last, remove last, add first, etc) with a LinkedList than an array list





        IFlyable flyNow = new Bird();
        flyNow.Fly();

        IFlyable flyDog = new Dog();
        flyDog.Fly();

        IAnimal bark = new Dog();
        bark.makeSound();

        Swimmable swimmer = new Dog();
        swimmer.swim();

        Runnable runner = new Cat();
        runner.run();

        List<IFlyable> flyers = new ArrayList<>();
        flyers.add(new Bird("Birddy"));
        flyers.add(new Eagle());
        flyers.add(new Dog());

        for (IFlyable f : flyers) {
            f.Fly();    //All fly differently, but we treat them the same
        }

        launchIntoSky(new Eagle());

    }

    public static void launchIntoSky(IFlyable flyer) {
        flyer.Fly();
        //This loop doesn't care 'what' kind of flyer it is-just that it can fly!

    }
}
