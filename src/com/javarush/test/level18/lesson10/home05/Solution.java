package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        String s;
        String[] str;
        double tmp;

        while ((s = bufferedReader.readLine()) != null)
        {
            str = s.split(" ");
            for (String item : str)
            {
                tmp = Math.round(Double.parseDouble(item));
                arrayList.add((int)tmp);
            }
        }
        bufferedReader.close();

        String num = "";
        for (int a : arrayList)
        {
            num = num + a + " ";
        }

        bufferedWriter.write(num);

        bufferedWriter.close();
    }
}
