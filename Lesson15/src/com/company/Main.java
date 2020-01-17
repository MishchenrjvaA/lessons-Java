package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

	//  FIlo first in, last out
        // stack

        Stack <String> stack = new Stack<>();
        // add добавляет элементы в стек
        stack.add("element 1");
        stack.add("element 2");
        stack.add("element 3");
        System.out.println(stack);

        // pop достает "верхний элемент стека"  и его удаляет
        System.out.println(stack.pop());

        System.out.println("стек после вызова pop");
        System.out.println(stack);

        //  push добавляет элемент в начало
        stack.push("element 4");
        System.out.println("стек после добавления нового элемента push");
        System.out.println(stack);

        // peek возвращает верхний элемент сткеа без его удаления
        System.out.println(stack.peek());
        System.out.println(stack);
        // search нкмерация начинается  с 1, в отличие от arrayList!
        System.out.print("Элемент \"element2\" находится по номеру: ");
        System.out.println(stack.search("element 2"));

        // очищаем коллекцию или удаляем все элементы из стека
        // при пустом стеке вызывается исключение

        stack.clear();
        try {
            System.out.println(stack.pop());
        } catch (EmptyStackException e){
            System.out.println("Ошибка! Стек пустой");
        }

        //  Queue - очередь.  FIFO first in, first out

        Queue<String> queue = new PriorityQueue<>(3);
        queue.add("q1");
        queue.add("q2");
        queue.add("q3");
        System.out.println(queue);

        // poll, remove  достает  и возвращает первый элемент в очереди и удаляет
        System.out.println(queue.poll());
        System.out.println(queue);

        // peek , element - возвращают первый элемент в очереди без удаления
        System.out.println(queue.peek());
        System.out.println(queue);

        // offer - добавить элемент если хватает capacity
        if (queue.offer("q4")){
            System.out.println("элемент добавлен");
        } else {
            System.out.println("не удалось добавить элемент");
        }


        UserComparator comparator = new UserComparator();
        Queue<User> users = new PriorityQueue<>(comparator);
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            User u = new User();
            u.setMoney(rand.nextInt(1000));
            users.add(u);
        }
        while (true){
            User u = users.poll();
            if (u == null){
                break;
            }
            System.out.println(u);

        }
        System.out.println(fact1(50));
        System.out.println(fact2(5));

    }
    // 5! = 1*2*3*4*5=120
    // 0! = 1
    //находим факториал
    public static int fact1(int n){
        int f = 1;
        for (;n != 1; n--) {
            f *=n; //f = f*n
        }
        return f;
    }

    //рекурсия
    // 5! =5*4!=5*4*3!
    public static int fact2(int n){
        if (n == 0) {
            return 1;
        }
        return n * fact2(n-1);

    }
}
