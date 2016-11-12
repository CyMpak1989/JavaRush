package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int PosCount = 0;
        int NegCount = 0;

        if (num1 >= 0)
        {
            PosCount++;
        }
        if (num2 >= 0)
        {
            PosCount++;
        }
        if (num3 >= 0)
        {
            PosCount++;
        }

        if (num1 < 0)
        {
            NegCount++;
        }
        if (num2 < 0)
        {
            NegCount++;
        }
        if (num3 < 0)
        {
            NegCount++;
        }

        System.out.println("количество отрицательных чисел: " + NegCount);
        System.out.println("количество положительных чисел: " + PosCount);
    }
}
