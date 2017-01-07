package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        Set<Integer> map = new HashSet<>();

        while (fileInputStream.available() > 0)
        {
            map.add(fileInputStream.read());
        }

        fileInputStream.close();

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.addAll(map);

        Collections.sort(arrayList);

        for (int list : arrayList)
        {
            System.out.print(list + " ");
        }
    }
}
