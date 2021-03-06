package com.company;

public class Main {

    public static void main(String[] args) {
        int s = sum( 12,  20,  56);
        System.out.println(s);
        float m = max( 12.7f,  15.8f, -67.0f);
        System.out.println(m);
        int []a = {12,23,4,6,9,0,7};
        s = sumAll(a);
        System.out.println(s);
        float r = sumOdd( 12.7f, 3.0f, 0.3f, 5.2f);
        System.out.println(r);
        a = bubbleSort(a);
        System.out.println("------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // объявление функции (метод класса)
        // void  - функция не возвращает значения (return можно на использовать)
        //return завершает выполнение функции
        }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public  static  float max(float x, float y, float z) {
        if (x > y && x > z) {
            return x;
        }
        if (y > x && y > z) {
            return y;
        }
        return z;
    }
    public  static int sumAll(int [] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++){
            s = s + arr[i];
        }
        return s;
    }
    // функция с переменным числом параметров (... любое кол-во параметров)
    public static float sumOdd(float...a) {
        float s = 0.0f;
        for (int i = 1; i < a.length; i++ ) {
            if (i % 2 == 0) {
                continue;
            }
            s = s + a[i];
        }
        return s;
    }
    // сортировка массивов
    //сортировка методом "пузырька" (неоптимален, редко используется, если поставить меньше будет обратный порядок
    // построения от большего к меньшему
    public  static int [] bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }

}
