package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(maxDiv(a, b));
    }

    public static int maxDiv(int w, int q)
    {
        int c = 0;
        int i = 1;

        while (i <= q && i <= w)
        {
            if ((q % i) == 0 && (w % i) == 0)
            {
                c = i;
                i++;
            } else
                i++;
        }
        return c;
    }
}
