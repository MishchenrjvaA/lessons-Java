package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// множества Set<E>
        // set коллекции этого типа хранит не дублирующиеся уникальные элементы
        // если есть hash, то коллекция может отображаться в разном порядке

        HashSet<String> set = new HashSet<>();
        set.add("string 1");
        set.add("string 2");
        set.add("string 3");

        System.out.println("коллекция после добавления");
        System.out.println(set);

        set.iterator(); //алгоритм кот помечает каким-либо образом элементы
        //при добавлении дублирующего значения с коллекцией ничего не происходит

        set.add("string 2");
        System.out.println("коллекция после добавления дублирующего элемента");
        System.out.println(set);

        set.remove("string 3");
        System.out.println("коллекция после удаления");
        System.out.println(set);

        System.out.println(set.size());

        // MAP хранит элементы по принципу ключ-значеине
        // первое - ключ, второе - значение
        //ключи не повторяются, значения перезаписываются

        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ivanov", 1000);
        map.put("Petrov", 1000);
        map.put("Sidorov", 500);
        System.out.println("После добавления ");
        System.out.println(map);
        map.put("Sidorov", 900);
        System.out.println("После добавления new");
        System.out.println(map);
        int value = map.get("Petrov");
        System.out.println(value);
        //возвращает множество ключей
        Set<String> keys =  map.keySet();
        System.out.println(keys);
        // возвращает список значений
        map.values();
        System.out.println(map.values());

        map.remove("Sidorov");
        System.out.println(map);
        map.entrySet();// посмотреть что делает?
        System.out.println(map.entrySet());
        // если не найдет значение ключа, вернет то, которое мы запишем
        value = map.getOrDefault("kiruhg", 555);
        System.out.println(value);

        // Date

        Date d = new Date();
        // getTime возвращает время в миллисекундах (01/01/1970)
        d.getTime();
        System.out.println(d.getTime());
        Date d2 = new Date(-452453241112575727l); // в миллисекундах, прошедших с 01.01.1970г!!!
        // чтобы записать большее значение в конце буква l (long)
        if (d.after(d2)){
            System.out.println("d > d2");
        }
        if (d.before(d2)) {
            System.out.println("d < d2");
        }
        d.compareTo(d2);

        //SimpleDateFormat форматирование даты
        // можно записать любое значение в любом порядке
        //можно добавить текст в одинарных ковычках

        /*SimpleDateFormat df = new SimpleDateFormat("G 'hello' yyyy EEEE");
        System.out.println(df.format(d2));
        SimpleDateFormat df2 = new SimpleDateFormat("d/m/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату");
        String  date = sc.nextLine();
        try {
            Date d3 = df2.parse(date);
            System.out.println(d3.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

         */

        // календарь дат CALENDAR
        // записывается нулевая точка года 01.01.1970
       // GregorianCalendar calendar = new GregorianCalendar(); можно так, а можно
        // месяца в java начинаются с 0
        GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance(); //статический метод
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.MINUTE, 25);
        System.out.println(calendar);
        // прибавление к дате
        calendar.add(Calendar.DAY_OF_MONTH, 28);
        System.out.println(calendar);
        // отнять от даты время/дни...
        calendar.add(Calendar.HOUR, -23);
        System.out.println(calendar);

        //отнать или прибавить, но чтобы календарь сам не досчитывал(без сдвига остальных)
        calendar.roll(Calendar.DAY_OF_MONTH, 30);
        System.out.println(calendar);
        //calendar.isLeapYear();
        if (calendar.isLeapYear(calendar.get(Calendar.YEAR))){
            System.out.println("год високосный");
        } else {
            System.out.println("год невисокосный");
        }



    }
}
