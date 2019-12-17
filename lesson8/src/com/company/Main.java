package com.company;

public class Main {

    public static void main(String[] args) {
	// объект класса

        User user1 = new User();
        user1.setName("Vasya");
        user1.setAge(16);
        User user2 = new User();
        user2.setName("Vasya");
        user2.setAge(-16);

        // для объектов user1 <> (не равно) user2, поскольку ссылки
        // user1 и user2 указывают на разные области памяти
        // рез-тат false
        // нужно переопределить в классе Obj

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));

        //hashcode для каждого объекта свой
        // при переопределении equals переопр-ся и хешкод
        //обязательно должно соблюдаться правило если
        // если x.equals (y) = true, то  и /
        // x.hashCode() == y.hashCode() == true
        // но это не тождественно правилу
        //  x.hashCode() == y.hashCode() == true, то и
        //  x.hashCode(y) должен возвращать true

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        if (user1.hashCode() == user2.hashCode()) {
            if (user1.equals(user2)){
                System.out.println("user1 == user2");
            } else {
                System.out.println("user1 != user2");
            }
        }
        User user3 = user2;
        // ВАЖНО!!! x.equals(y) == y.equals(x)
        System.out.println(user3.equals(user2));
        System.out.println(user3.hashCode());

        // используется для получения метаинформации о классе
        user1.getClass();
        System.out.println(user1.getClass());

        // выводит строку, которую вернет метод

        user1.toString();
        System.out.println(user1.toString());

        // пример работы фабричного класса

        new UserFactory()
                .signIn(" some@mail")
                .sentMessage(" hell0")
                .deactivate()
                .sentMessage(" How are you?")
                .activate()
                .sentMessage(" Hi")
                .signOut();


    }


}
