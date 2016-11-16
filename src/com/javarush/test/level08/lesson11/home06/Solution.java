package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human rebenok = new Human("Катя", false, 12);
        Human rebenok1 = new Human("Вова", true, 12);
        Human rebenok2 = new Human("Анна", false, 12);
        ArrayList<Human> deti = new ArrayList<>();
        deti.add(rebenok);
        deti.add(rebenok1);
        deti.add(rebenok2);

        Human father = new Human("Папа", true, 3, deti);
        Human mather = new Human("Мама", false, 3, deti);
        ArrayList<Human> papaMama = new ArrayList<>();
        papaMama.add(father);
        papaMama.add(mather);

        Human grandFather = new Human("Дедушка", true, 50, papaMama);
        Human grandFather1 = new Human("Дедушка2", true, 55, papaMama);
        Human grandMather = new Human("Бабушка", false, 45, papaMama);
        Human grandMather1 = new Human("Бабушка2", false, 51, papaMama);

        System.out.println(grandFather);
        System.out.println(grandFather1);

        System.out.println(grandMather);
        System.out.println(grandMather1);

        System.out.println(father);
        System.out.println(mather);

        System.out.println(rebenok);
        System.out.println(rebenok1);
        System.out.println(rebenok2);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
