package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        String input;
        ArrayList<String> list = new ArrayList<>();
        Map<String, Double> map = new TreeMap<>();
        while ((input = fileReader.readLine()) != null)
        {
            list.add(input);
        }

        fileReader.close();

        String[] stringArray;
        for (String aFileList : list)
        {
            stringArray = aFileList.split(" ");
            if (map.containsKey(stringArray[0]))
            {
                Double a = map.get(stringArray[0]);
                map.put(stringArray[0], Double.parseDouble(stringArray[1]) + a);
            } else
            {
                map.put(stringArray[0], Double.parseDouble(stringArray[1]));
            }
        }

        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
