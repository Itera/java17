package com.itera.java17.sealed;

public abstract sealed class Dog extends Animal permits BigDog, SmallDog {
    String getName() {
        return "Dog";
    }
}
