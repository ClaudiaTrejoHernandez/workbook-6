package com.pluralsight.domain;

import com.pluralsight.interfaces.IFlyable;

public class Bird implements IFlyable {

    private String birdName;

    public Bird(String birdName) {
        this.birdName = birdName;
    }

    public Bird() {

    }

    @Override
    public void Fly() {
        System.out.println("Regular Speed");

    }
}
