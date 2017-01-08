package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        byte[] buf = new byte[fileInputStream.available()];
        int count = 0;

        while (fileInputStream.available() > 0)
        {
            fileInputStream.read(buf);
        }

        fileInputStream.close();

        for (int i = 0; i < buf.length; i++)
        {
            if (buf[i] > 64 && buf[i] < 91)
            {
                count++;
            }
            if (buf[i] > 96 && buf[i] < 123)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
