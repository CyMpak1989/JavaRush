package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> catMap = new HashMap<>();
        catMap.put("Vasilyy1", new Cat("Vasilyy1"));
        catMap.put("Vasilyy2", new Cat("Vasilyy2"));
        catMap.put("Vasilyy3", new Cat("Vasilyy3"));
        catMap.put("Vasilyy4", new Cat("Vasilyy4"));
        catMap.put("Vasilyy5", new Cat("Vasilyy5"));
        catMap.put("Vasilyy6", new Cat("Vasilyy6"));
        catMap.put("Vasilyy7", new Cat("Vasilyy7"));
        catMap.put("Vasilyy8", new Cat("Vasilyy8"));
        catMap.put("Vasilyy9", new Cat("Vasilyy9"));
        catMap.put("Vasilyy0", new Cat("Vasilyy0"));
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> cats = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            cats.add(pair.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat : set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat " + this.name;
        }
    }


}
