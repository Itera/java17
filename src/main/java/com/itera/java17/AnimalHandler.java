package com.itera.java17;

import com.itera.java17.beforesealed.*;

public class AnimalHandler {
    boolean handleAnimal(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            return cat.meows();
        } else if (animal instanceof BigDog) {
            BigDog dog = (BigDog) animal;
            return dog.barks();
        } else if (animal instanceof SmallDog) {
            SmallDog dog = (SmallDog) animal;
            return dog.yaps();
        } else {
            throw new IllegalStateException("Unknown animal type");
        }
    }
}
