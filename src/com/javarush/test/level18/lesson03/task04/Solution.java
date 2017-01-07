package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
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
        int minValue = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> l : map.entrySet())
        {
            if (minValue > l.getValue())
            {
                minValue = l.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> l : map.entrySet())
        {
            if (l.getValue() == minValue)
            {
                System.out.print(l.getKey() + " ");
            }
        }
    }
}
