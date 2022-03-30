package com.itera.java17.sealed;

public final class Cat extends Animal {
    String getName() {
        return "Cat";
    }

    public boolean meows() {
        return true;
    }
}
