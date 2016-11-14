package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFather1 = new Human("Вася", true, 59);
        Human grandFather2 = new Human("Петр", true, 62);

        Human grandMother1 = new Human("Марья", true, 57);
        Human grandMother2 = new Human("Лилия", true, 60);

        Human father = new Human("Максим", true, 30, grandFather1, grandMother1);
        Human mother = new Human("Майа", true, 26, grandFather2, grandMother2);

        Human baby1 = new Human("Джон", true, 5, father, mother);
        Human baby2 = new Human("Йоки", false, 4, father, mother);
        Human baby3 = new Human("Рикки", false, 7, father, mother);

        System.out.println(grandFather1);
        System.out.println(grandFather2);

        System.out.println(grandMother1);
        System.out.println(grandMother2);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(baby1);
        System.out.println(baby2);
        System.out.println(baby3);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
