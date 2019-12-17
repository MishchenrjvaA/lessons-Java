package com.company;

public class User {


    private   String name;
    private int age;


    @Override
    public boolean equals(Object obj) {
        // явно преобразуем obj к типу User
        // если явное преобразование не вожможно
        // то в рез-те преобр-я м ыполучим значение
        // значение null
        //проверять на значение null!!!

        User user = (User)obj;
        // поскольку св-во name являестя объетом типа String
        // то его сравнение должно производиться ч-з
        // метод equals ()
        return this.age == user.age &&
                this.name.equals(user.name);

    }
     /* @Override
    public int hashCode() {
        if (this.age > 18) {
            return 1;
        }
        return 2;
    } */

    @Override
    public String toString(){
        return this.name;
    }
    // геттер св-ва name (только возвращать)
    public String getName(){
        return this.name;
    }
    // сеттер св-ва name (нужно устанавливать св-ва)
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        if (age < 0 || age > 120){
            System.out.println("недоустимое значение");
        }else {
            this.age = age;
        }
    }



}
