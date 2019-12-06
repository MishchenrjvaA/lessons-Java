package com.company;
// т.о класс dog наследует класс Animal
//свойства / методы родителя
// public - наследуется
// private - не наследуется
// protected  - наследуется, если в другом com.company то наследуется без доступа...
public class Dog extends Animal {

    public String breed; // порода

    public void bark() {
        System.out.println("haw-haw");
    }
    @Override //переопределение метода
    public void sleep (int h) {
        System.out.print("dog sleep ");
        System.out.print(h);
        System.out.println(" hours");

    }

    @Override
    public void eat () {
        super.eat();  // super - указатель на объект родителя
        System.out.println("dog is not hungry anymore");
    }

}
