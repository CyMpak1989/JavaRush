package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Вася", 19, "Алушта");
        Man man2 = new Man("Петя", 23, "Симферополь");
        Woman woman1 = new Woman("Таня", 18, "Одесса");
        Woman woman2 = new Woman("Маня", 19, "Киев");// Создай по два объекта каждого класса тут

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);// Выведи их на экран тут
    }

    public static class Man
    {
        String name;
        int age;
        String address;

        Man(String name)
        {
            this.name = name;
        }

        Man(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        Woman(String name)
        {
            this.name = name;
        }

        Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
