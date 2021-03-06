package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        Map<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0)
        {
            int a = fileInputStream.read();
             if (map.containsKey(a))
             {
                 int b = map.get(a);
                 map.put(a, ++b);
             } else {
                 map.put(a, 1);
             }
        }

        fileInputStream.close();

        int maxValue = 0;

        for (Map.Entry<Integer, Integer> l : map.entrySet())
        {
            if (maxValue < l.getValue())
            {
                maxValue = l.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> l : map.entrySet())
        {
            if (l.getValue() == maxValue)
            {
                System.out.print(l.getKey() + " ");
            }
        }
    }
}
