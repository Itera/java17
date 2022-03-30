package com.itera.java17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SealedTest {
    @Test
    void testOldBeforeSealed() {
        AnimalHandler animalHandler = new AnimalHandler();

        assertTrue(animalHandler.handleAnimal(new com.itera.java17.beforesealed.Cat()));
        assertTrue(animalHandler.handleAnimal(new com.itera.java17.beforesealed.BigDog()));
        assertTrue(animalHandler.handleAnimal(new com.itera.java17.beforesealed.SmallDog()));
    }

    @Test
    void testSealed() {
        SealedAnimalHandler animalHandler = new SealedAnimalHandler();

        assertTrue(animalHandler.handleAnimal(new com.itera.java17.sealed.Cat()));
        assertTrue(animalHandler.handleAnimal(new com.itera.java17.sealed.BigDog()));
        assertTrue(animalHandler.handleAnimal(new com.itera.java17.sealed.SmallDog()));
    }
}
