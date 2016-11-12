package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int maxAB = max(a, b);
        int max = max(maxAB, c);
        int minAB = min(a, b);
        int min = min(minAB, c);
        if ((a > min) && (a < max)) System.out.println(a);
        if ((b > min) && (b < max)) System.out.println(b);
        if ((c > min) && (c < max)) System.out.println(c);
    }

    private static int min(int a, int b)
    {
        if (a < b) return a;
        else return b;
    }

    private static int max(int a, int b)
    {
        if (a > b) return a;
        else return b;
    }
}
