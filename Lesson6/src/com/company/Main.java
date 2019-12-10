package com.company;

public class Main {

    public static void main(String[] args) {
	//
       /* Animal animal = new Animal("white", 10); // this = animal
        System.out.println(animal.color);
        System.out.println(animal.age);
        System.out.println(animal.color);// this = animal
        System.out.println(animal.age);// this = animal
        Animal animal2 = new Animal("red", 15);
        System.out.println(animal2.color);
        System.out.println(animal2.age);

        */

        Dog dog = new Dog();
        // обращение к стаическим полям класса осущес-ся через названме класса, на можно и через объект
        dog.footcount = 4;
        System.out.println(dog.color);
        Dog dog2 = new Dog();//( color: "blue", age: 5, name: "rex");
        System.out.println(dog2.footcount);
        System.out.println(dog2.color);
        System.out.println(dog2.name);
        dog2.say("aw-aw");
        Dog.Cat cat = new Dog.Cat();
        cat.name = "Rainbow";
        dog.bark();
        Dog.bark();

    }
}
