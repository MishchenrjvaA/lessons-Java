package com.company;

public class Animal {

    // свойства объекта
    public float weigth;
    String color;
    private float heigh;
    protected int age;

    //методы объекта
    public void eat() {
        System.out.println("animal eat");
            }

     // перегрузка метода sleep

    void sleep() {
        System.out.println("animal sleep ");
    }
    public void sleep(int h) {
        System.out.print("animal sleep ");
        System.out.print(h);
        System.out.println(" hours");
    }

    public void sleep (int h, int m) {
        System.out.print("animal sleep ");
        System.out.print(h);
        System.out.print(" hours and ");
        System.out.print(m);
        System.out.println(" minutes ");


    }


}
