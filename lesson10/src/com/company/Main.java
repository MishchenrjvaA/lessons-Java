package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // файлы в java . есть относительный путь и абсолютный
        // абсолютный путь к файлу (можно указать путь к папке)
        File f = new File("C:\\Programs\\1.txt");
        f.exists();
        if (f.exists()){
            System.out.println("файл существует");
        } else {
            System.out.println("Файла не существует");
        }
        //относительный путь к файлу
        File ff = new File("1.txt");
        if (!ff.exists()) {
            try {
                ff.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // список всех возможных файлов
        // getName возвращает последнюю часть названия
        // проверяем файл на доступность записи

        ff.canWrite();
        System.out.println(ff.canWrite());
        // сравнивает пути, ссылается ли на один объект (возвр значение. разница по длине)
        ff.compareTo(f);
        // delelte удаляет файл сразу после вызова
        // ff.delete()
        // deleteOnExit удаляет файл после завершения прогаммы
        //ff.deleteOnExit();
        // вернет файл..
        ff.getAbsoluteFile();
        //вернет полное название файла но только строку ссылку
        ff.getAbsolutePath();
        // вернет свободное место на диске (инфу о нем)
        ff.getFreeSpace();
        // возвр всю часть пути без названия файла
        ff.getPath();
        // проверяет это путь к файлу или папке
        ff.isDirectory();
        // возвр время когда изменен, но с 1 января 1970г
        ff.lastModified();

        // работа с папкой
        File dir = new File( "C:\\Python27");
        String []files =  dir.list();
        for (int i = 0; i < files.length; i++){
            System.out.println(files[i]);
        }

        // методы для создания папок
        File dir2 = new File("D:\\Test\\Hello");
        if (!dir2.exists()) {
            // mkdir создает только последнюю папку по указанному пути
            //dir2.mkdir();
            // создает все папки по указанному пути
            dir2.mkdirs();
        }

        // изменение содержимого файла или папки

        // чтение содержимого текстового файла

        try {
            FileReader fr = new FileReader(ff);
            int c = fr.read();
            while (c != -1){
                System.out.print((char)c);
                c = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         // запись в файл
        // всегда перезаписывает содержимое файла
        // append дописывает в конец

        try {
            FileWriter fw = new FileWriter("2.txt");
            fw.write("Hello\nworld\nПривет!"); // \n перенос на новую строку
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // перобраз-е сторки в число
        System.out.println();
        try {
            FileReader fr2 = new FileReader("input.txt");
            //int []numbers = new int[6];
            int c = fr2.read();
            String number = "";
            while (c != -1){
                if ((char)c == ' '){
                    int v = Integer.parseInt(number,10);
                    System.out.println(v * v);
                    number = "";
                } else {
                    number += (char)c;
                }
                c = fr2.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
