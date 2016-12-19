package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter(reader.readLine());
        ArrayList<String> list = new ArrayList<>();

        while (true)
        {
            String a = reader.readLine();
            list.add(a);
            if (a.equals("exit"))
            {
                for (String x : list)
                {
                    fileWriter.write(x);
                }
                break;
            }
            list.add("\n");
        }

        fileWriter.close();
    }
}
