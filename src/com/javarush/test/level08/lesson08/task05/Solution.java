package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("Sim", "Sim");
        stringMap.put("Tom", "Tom");
        stringMap.put("Arbus", "Arbus");
        stringMap.put("Baby", "Baby");
        stringMap.put("Cat", "Cat");
        stringMap.put("Dog", "Dog");
        stringMap.put("Eat", "Dog");
        stringMap.put("Food", "Food");
        stringMap.put("Gevey", "Gevey");
        stringMap.put("Hugs", "Hugs");
        return stringMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> tmp = new HashMap<>(); //тут всегда будет храниться одна пара (K,V)
        HashMap<String, String> copy = new HashMap<>(map); //по копии будем пробегаться в цикле(не меняя её)
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator(); // copy!
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            if(map.containsValue(pair.getValue())) //если map еще содержит такое же значение, как и в копии
                tmp.put(pair.getKey(), pair.getValue()); // то заносим это значение во временную коллекцию
            map.remove(pair.getKey()); // удаляем текущее значение из map, что бы оно не учавствовало в следующем методе
            int size = map.size(); //размер до
            removeItemFromMapByValue(map, pair.getValue());
            int size2 = map.size(); //размер после
            if(size == size2) // если одинаковых имен не нашлось
            {
                map.putAll(tmp); // возвращаем ныне удаленное значение обратно в map
            }
            tmp.clear(); //чистим времянку
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
