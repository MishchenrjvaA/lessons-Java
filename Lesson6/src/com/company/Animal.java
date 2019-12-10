package com.company;

// in java невозможно создать экземпляр абстрактного класса

public abstract class Animal {
    // конструктор
    public String color;
    public int age;

    /*public Animal() {
        this.color = "black";
        age = 1;
        System.out.println("animal was created");
    }

     */


    public Animal( String color, int age){
        // this. - указатель(ссылка) на текущий экземпляр объекта
        this.color = color;
        this.age = age;

    }

    public abstract void say(String word);
}
