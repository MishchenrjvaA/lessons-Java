package com.company;

public class Dog extends Animal {
    public String name;
    // статические св-ва располагаются в памяти в единственном экземпларе
   public static int footcount;

    public Dog() {
        super("green", 5);
    }
    public Dog(String color, String name, int age){
    super(color, age);
    this.name = name;
    }
    // say  - определение родительского обстрактного метода say
    public void say(String sound) {
        System.out.println("haw-haw" + sound);
    }
    //  внутренний класс (inner class)
    public static class Cat {
        public  String name;

        Cat() {
           this. name = " I am Cat";
           name = "I am Dog";
        }
    }
    private class Mouse {
        Mouse() {
            name = "I am mouse";
        }
    }
    public static void bark(){
        // для статич методов нельзя исп-ть ссылку на экземпляр объекта (this)
        // this.name = "asd" - ошибка

        System.out.println("bark");
        sleep();
    }
    public static void sleep() {
        System.out.println("z-z-z-z-z");
    }
}



