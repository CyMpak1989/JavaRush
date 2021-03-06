package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        byte[] a = new byte[fileInputStream.available()];

        while (fileInputStream.available() > 0)
        {
            fileInputStream.read(a);
        }

        fileInputStream.close();

        int counFull = a.length;

        int count = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == 32)
            {
                count++;
            }
        }

        float result = (float) ((float) count / counFull * 100.0);
        System.out.println(String.format(Locale.ENGLISH, "%.2f", result));
    }
}
