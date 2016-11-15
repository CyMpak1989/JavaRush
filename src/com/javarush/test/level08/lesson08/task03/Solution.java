package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<>();

        map.put("vvikov", "vova");
        map.put("vovkov", "vova");
        map.put("vovikv", "vova");
        map.put("ovikov", "vova");
        map.put("voikov", "vova");
        map.put("voviov", "vova");
        map.put("voviko", "vova");
        map.put("svovikov", "vova");
        map.put("kvovikov", "vova");
        map.put("zvovikov", "vova");

        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {

            String name1 = pair.getValue();
            if (name.equals(name1))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count1 = 0;

        for (Map.Entry<String, String> pair1 : map.entrySet())
        {
            String fam = pair1.getKey();
            if (lastName.equals(fam))
                count1++;
        }
        return count1;
    }
}
