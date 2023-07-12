package com.company.InueronMockTest;

public class Que1 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();

        Animal dog = new Dog();
        dog.makeSound();

        Animal cow = new Cow();
        cow.makeSound();
    }
}



class Animal {
     void makeSound(){
         System.out.println(" ");
     }
}

class Cat extends Animal {
    @Override
    void makeSound(){
        System.out.println("meow");
    }
}

class Dog extends Animal {
    @Override
    void makeSound(){
        System.out.println("woof woof");
    }
}

class Cow extends Animal {
    @Override
    void makeSound(){
        System.out.println("moo moo");
    }
}

