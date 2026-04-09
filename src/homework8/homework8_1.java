package homework8;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class homework8_1 {
    /*
   Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // cоздаём сканер
        System.out.println("Введите набор чисел в виде одной строки через запятую (Пример: 1, 2, 3, 4, 4, 5)");
        String input = scanner.nextLine(); // считываем строку целиком
        String[] numbers = input.split(",\\s*"); // делим строку на элементы по разделителю запятая + пробел

        Set<Integer> uniqueNumbers = new LinkedHashSet<>(); // создаем коллекцию LinkedHashSet потому что она автоматически удаляет дубликаты и сохраняет порядок добавления элементов
        for (String str : numbers) {
            int number = Integer.parseInt(str.trim()); // преобразуем строку в целое число и добавляем в коллекцию, если число уже есть в коллекции, оно не должнро добавляться
            uniqueNumbers.add(number);
        }
        System.out.println(uniqueNumbers);
    }
}

