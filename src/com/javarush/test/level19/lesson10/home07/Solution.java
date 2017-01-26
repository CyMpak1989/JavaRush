package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready())
        {
            String[] text = fileReader.readLine().split(" ");
            for (String words : text)
            {
                if (words.length() > 6)
                {
                    stringBuilder.append(words + ",");
                }
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        fileWrite.write(stringBuilder.toString());
        fileReader.close();
        fileWrite.close();
    }
}
