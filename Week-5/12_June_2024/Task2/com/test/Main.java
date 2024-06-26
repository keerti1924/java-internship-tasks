package com.test;

import com.animals.Animal;
import com.animals.Cat;
import com.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
