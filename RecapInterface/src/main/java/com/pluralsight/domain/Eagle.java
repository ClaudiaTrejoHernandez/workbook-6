package com.pluralsight.domain;

import com.pluralsight.interfaces.IFlyable;

public class Eagle implements IFlyable {

    @Override
    public void Fly() {
        System.out.println("Super fast");

    }
}
