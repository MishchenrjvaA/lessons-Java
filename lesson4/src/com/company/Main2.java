package com.company;

public class Main2 {

    public static void main(String[] args) {
        // бинарные операторы
        // & - бинарное (двоичное) и
        System.out.println(5 & 7);
        // || - бинарное или
        System.out.println(5 | 7);
        // >> бинарный сдвиг вправо
        System.out.println(7 >> 2);
        // бинарный сдвиг влево
        System.out.println(5 << 3);
        // Пример
        // 4 первых бита это скорость (13)
        // с 5 по 7 бит это напряжение (4)
        // с 8 по 11 это сила тока (9)
        // 1001 100 1101 = 1229
        // 0000 000 1111 бинарная маска, при ее применении получим
        // 0000 000 1101
        int data = 1229;
        // 00000000 1101
        // 1й вариант

        int speed = data << 27;
        speed = speed >> 27;
        System.out.println(speed);
        // 2й вариант
        int maskSpeed = 15; // 1111
        speed = data & maskSpeed;
        System.out.println(speed);

        // напряжение
        // применим маску 0000 111 0000 = 0000 100 0000
        // в десятичном виде это 112
        int maskVoltage = 112;
        int voltage = (data & maskVoltage) >> 4;
        System.out.println(voltage);

        // сила тока
        // можно маску 1111 000 0000 . а можно и сразу сдвинуть впарво на 7
        int current = data >> 7;
        System.out.println(current);
    }
}
