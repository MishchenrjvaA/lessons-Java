package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Перечисления
        User u = new User();
        u.language = Language.EN;
        u.color = Color.Green;
        System.out.println(u.color.getValue());

        //можно сделать калькулытор
        Math m = Math.SUM;
        System.out.println(m.action(23, 12));
        m = Math.MULTIPLY;
        System.out.println(m.action(45, 10));

        switch (u.language) {
            case EN:
                System.out.println("Пользователь выбрал иностранный язык");
                break;
            case RU:
            case BY:
            case UA:
                System.out.println("Выбран язык не иностранный");
        }

        // String

        String s = "hello";
        String s2 = new String("not recommended");

        // StringBuilder выделяет дополнительный буффер памяти (большая скорость записи)
        StringBuilder sb = new StringBuilder("abcdefg");

        // append добавляет значение в конец исходной строки
        sb.append("uhgg");

        // StringBuffer == StringBuilder но
        // StringBuffer - потокобезопасный

        // класс String

        String str = "    hello World    ";
        str.contains("Hello");// проверяет комбинацию симвоолов идущих подряд
        //charAt возвращает символ строки по указанному индексу
        str.charAt(4); // ==[]
        System.out.println(str.charAt(4));
        // возврат код символа в таблице кодировки тип инт
        str.codePointAt(4);
        System.out.println(str.codePointAt(4));
        // comhareTo - сравнение строк между собой
        //str.compareTo();
        System.out.println("12345".compareTo("128")); //5
        // compareToIgnoreCase для него все символы одинаковы
        //str.compareToIgnoreCase();

        //str.getBytes()// преобразует строку в массив байт
        byte[] b = str.getBytes();
        for (int i = 1; i <= 0; i++) {
            System.out.println(b[i]);
        }

        //преобразование массива байт в строку
        String strFfomBytes = new String(b);
        // equalsIgnoreCase сравнивает 2 строки между собой без учета регистра
        System.out.println("abCDef".equalsIgnoreCase("ABCDef")); // значение будет true

        // str.indexOf() возвращает индекс (int - код символа)символа или строки
        // в исходной строке
        //если совпадени не найдено, возвращает "-1"
        System.out.println(str.indexOf("whor"));
        System.out.println(str.indexOf('$'));

        // str.lastIndexOf() сверяет с конца строки
        // lastIndexOf == indexOf, но поиск начинается с конца строки

        System.out.println("hello".indexOf('l')); // 2
        System.out.println("hello".lastIndexOf('l'));//3 (выводит индекс относительно начала)
        // не модифицирует исходную строку,
        String str2 = str.replace("hello", "hi"); //заменяет подстроку в исходной строке
        System.out.println(str2);
        //split разделяет строку по символу либо строке
        str.split(" "); // пробел -> пустая строка
        "hello all hi".split(" "); // {"hello" "all" "hi"}
        String[] chunks = str.split(" ");
        for (int i = 0; i < chunks.length; i++) {
            System.out.println(chunks[i]);
        }
        // выделяет подстроку в строке
        // str.substring();
        // 8 начальный индекс
        //13 конечный индекс (13-й не включая)

        System.out.println(str.substring(8, 13));
        // приведение регистров
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        //форматирование строк
        /*
           Флаги форматирования:
        %s вставляется строка
        %d целое число(int, long)
        %f вещественное число ()
        %b для типа boolean
        %c char (символ который должен вывести)
        %t дл вывода даты
        %% вывод символа процент
         должен совпадать и тип и порядок следования

         %10.2f до точки - указ мин кол-во символов для числа, после точки - верхняя граница,
         значнеие до  точки можно опустить
         \n переход на новую строку (виртуальный enter)
         \t символ табуляции
         \b удаляет предыдущий символ (backspace)
         \\ - выводит слеш, если нужно 2\ пишем 4\


         */

        int age  = 25;

        Date d = new Date();
        String sFormat = String.format(
                "Меня зовут %10s.\nМне %d лет.\bМой рост %10.2f см. Я хочу знать java на 100%%. сегодня %tc", "All",30,170.1f,d);
        System.out.println(sFormat);
        String sFormat2 = String.format(
                "Мое счастливое число %2$d. Мой любимый цвет %s. Я ношу %1$s брюки", "RED", 40);  // 2$ - номер аргумента
        System.out.println(sFormat2);
        // преобразование нестроковых объектов в строки
        int a = 150;
        String sa = String.valueOf(a);
        System.out.println(sa);
        double h = 25.52;
        String sh = String.valueOf(h);
        System.out.println(sh);


    }


}
















