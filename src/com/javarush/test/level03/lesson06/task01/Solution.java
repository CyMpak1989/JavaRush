package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String mama = "Мама", milo = "Мыла", rama = "Раму";
        System.out.println(mama+milo+rama);
        System.out.println(mama+rama+milo);
        System.out.println(milo+rama+mama);
        System.out.println(milo+mama+rama);
        System.out.println(rama+mama+milo);
        System.out.println(rama+milo+mama);
    }
}