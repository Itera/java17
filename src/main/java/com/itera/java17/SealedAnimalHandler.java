package com.itera.java17;

import com.itera.java17.sealed.Animal;
import com.itera.java17.sealed.BigDog;
import com.itera.java17.sealed.Cat;
import com.itera.java17.sealed.SmallDog;

public class SealedAnimalHandler {
    boolean handleAnimal(Animal animal) {
        return switch (animal) {
            case Cat cat -> cat.meows();
            case BigDog dog -> dog.barks();
            case SmallDog dog -> dog.yaps();
        };
    }
}
