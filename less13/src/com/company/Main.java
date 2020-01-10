package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User<String,String> u = new User<>();
        User<Date,Object> u2 = new User<Date,Object>();
        u.id = "Some id";
        System.out.println(u.id.toLowerCase());
        u2.id = new Date();
        System.out.println(u2.id.getTime());

        Car<User> car = new Car<>();


        // Коллекции

        //Коллекция ArrayList (все элементы располагаются друг за другом, порядок элементов автоматически не меняется
        // возможен\допустим случайный доступ к элементам

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");//  0   //метод add добавляет элемент в конец списка
        list.add("World");//1
        list.add(1,"java");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //get = []
        }
        list.remove("Hello");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
       //Integer i = 20;
        list2.remove(new Integer(20));  // или Integer.valueOf(20)
        System.out.println(list2);
        list2.ensureCapacity(4);
        list2.set(1,12); // заменяет знатение, add добавляет значение

    }
}
