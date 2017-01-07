package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        reader.close();

        while (fileInputStream.available() > 0)
        {
            byte[] res = new byte[fileInputStream.available()];
            int count = fileInputStream.read(res);

            for (int i = 0; i < res.length / 2; i++)
            {
                byte tmp = res[i];
                res[i] = res[res.length - i - 1];
                res[res.length - i - 1] = tmp;
            }

            fileOutputStream.write(res, 0, count);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}