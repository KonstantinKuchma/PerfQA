package homework8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class homework8_3 {
    /*
   Задача 3:
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
    */
    public static Map<String, Boolean> wordMultiple(String[] words) {

        Map<String, Integer> frequency = new HashMap<>(); // карта для подсчёта частоты встречаемости каждой строки

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1); // если слово уже есть в карте, увеличиваем счётчик на 1, если нет — ставим 1 (метод getOrDefault)
        }

        Map<String, Boolean> result = new HashMap<>(); // создаём итоговую карту с результатами (String, Boolean)

        for (String word : frequency.keySet()) { // проходим по всем уникальным строкам из исходной карты
            int count = frequency.get(word); // true, если частота >= 2, иначе false
            result.put(word, count >= 2);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] test1 = {"a", "b", "a", "c", "b"}; // пример 1 из задачи
        System.out.println(Arrays.toString(test1));
        System.out.println(wordMultiple(test1));
        System.out.println();

        String[] test2 = {"c", "b", "a"}; // пример 2 из задачи
        System.out.println(Arrays.toString(test2));
        System.out.println(wordMultiple(test2));
        System.out.println();

        String[] test3 = {"c", "c", "c", "c"}; // пример 3 из задачи
        System.out.println(Arrays.toString(test3));
        System.out.println(wordMultiple(test3));
    }
}
