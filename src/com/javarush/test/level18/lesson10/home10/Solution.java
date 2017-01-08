package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> fileNameArray = new ArrayList<>();
        String fileName;
        while (true)
        {
            fileName = fileReader.readLine();
            if (!fileName.equals("end"))
            {
                fileNameArray.add(fileName);
            } else
            {
                fileReader.close();
                break;
            }
        }

        Map<Integer, String> map = new TreeMap<>();

        for (String x : fileNameArray)
        {
            for (int i = 0; i <= fileNameArray.size(); i++)
            {
                if (x.endsWith("part" + (i)))
                {
                    map.put(i, x);
                }
            }
        }

        String a = map.get(1);
        FileOutputStream out = new FileOutputStream(a.substring(0, a.length() - 6));
        for (Map.Entry<Integer, String> pair : map.entrySet())
        {
            FileInputStream in = new FileInputStream(pair.getValue());
            byte[] buff = new byte[in.available()];
            if (in.available() > 0)
            {
                int count = in.read(buff);
                out.write(buff, 0, count);
            }
            in.close();
        }
        out.close();
    }
}
