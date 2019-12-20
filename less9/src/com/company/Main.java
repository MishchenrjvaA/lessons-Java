package com.company;

public class Main {

    public static void main(String[] args) {
        // исключения
        // стандартные исключения
        // любое исключение задается в виде классов

        /*int a = 10;
        a = a/0;
        */
        int index = 2;
        int[] a = new int[3];
        try {
            //внутри помещаем код который потенциально может
            // вызвать исключение
            a[2] = 17;
           index = index /0;

            System.out.println("эта надпись не должна отобразиться");
            // если выскочила ошибка выполнение кода перейдет на catch
        } // после блока try может быть несколько блоков catch
        catch (ArrayIndexOutOfBoundsException e) {
            // здесь будет даступна перем е класса ArrayIndexOutOfBoundsException
            e.printStackTrace();
            System.out.println("Что-то пошло не так");
        }
        catch(ArithmeticException e) {
          System.out.println("деление на ноль");
        }

        System.out.println("я не вылетела");
        // оработка и генерация пользовательских исключений

        try {
            // генерирует исключения
            throw new MyException();
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.timestamp);
        }
        catch (RuntimeException e){}
            // порядок catch-ей имеет значение
        // и класс Exception и Throwable должны находиться ниже
        // чем пользовательские исключения
        // если среди catch-ей присутствует класс Exception и Throwable
        // то этот catch  работает в том случае, если
        // не сработал ни один из пользовательских классов-исключений.
        try {
            test();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        // игра угадай число
        Game game = new Game();
        game.start();
    }

    public static void test()throws MyException, RuntimeException {
        getMoney(-100);
    }

    // чтобы вызвать внутри другого метода после метода указ throw
    // и перечисляем все исключения которые наш метод генерирует
    public static void getMoney(int money) throws MyException, RuntimeException  {
        if (money <= 0 || money > 1000) {
            throw new MyException();
        }
        System.out.println("деньги сняты");
        throw new RuntimeException();
    }


}
