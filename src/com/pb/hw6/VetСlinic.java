package com.pb.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception {

        Animal[] animals = new Animal[] {
            new Dog("мясо", "в доме"),
            new Cat("рыба", "в доме"),
            new Horse("трава", "в стайне")
        };

        Class veterinarianClazz = Class.forName("com.pb.hw6.Veterinarian");
        Constructor veterinarianConstructor = veterinarianClazz.getConstructor(new Class[] {});
        Object veterinarianObj = veterinarianConstructor.newInstance();

        for (Animal animal: animals) {
            ((Veterinarian) veterinarianObj).treatAnimal(animal);
        }
    }
}
