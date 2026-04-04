package homework7;

import java.util.Scanner;

public class homework7_4 {
    /*
    Задача 4:
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создание сканера

        System.out.println("Введите 3 строки"); //вводим три строки
        String stroka1 = scanner.nextLine();
        String stroka2 = scanner.nextLine();
        String stroka3 = scanner.nextLine();


        String result = findFirstUniqueWord(stroka1, stroka2, stroka3); // вызываем метод findFirstUniqueWord, передавая ему строки, найденное слово сохраняем в переменную result

        if (result != null) { // проверяем, найдено ли слово с уникальными символами
            System.out.println("Первое слово из различных символов: " + result); // если слово найдено, выводим его и указываем, что это первое слово из различных символов
        } else {
            System.out.println("Слов из различных символов не найдено."); // если подходящего слова не найдено
        }

        scanner.close();
    }

    private static String findFirstUniqueWord(String stroka1, String stroka2, String stroka3) { // метод поиска первого слова с уникальными символами среди трёх введенных строк
        String[] stroki = {stroka1, stroka2, stroka3};   // создаём массив строк с тремя строками

        for (String line : stroki) {  // перебираем каждую строку из массива lines с помощью цикла for‑each

            String[] words = line.trim().split("\\s+"); // разбиваем текущую строку на слова, trim() - удаляет пробелы, split("\\s+") разбивает строку по пробелам

            for (String word : words) { // перебираем каждое слово из массива words
                if (!word.isEmpty() && hasAllUniqueChars(word)) { // !word.isEmpty() - проверяем, что слово не пустое, hasAllUniqueChars - все символы уникальные
                    return word;
                }
            }
        }
        return null; // если ни одно слово не удовлетворяет условию, возвращаем null
    }

    private static boolean hasAllUniqueChars(String word) { // метод проверки уникальности всех символы в слове
        char[] chars = word.toCharArray(); //  строку word в массив символов
        int length = chars.length;// длина массива символов

        for (int a = 0; a < length; a++) { // перебираем символы слова по индексу a от первого до предпоследнего
            for (int b = a + 1; b < length; b++) { // сравниваем текущий символ со всеми последующими)
                if (chars[a] == chars[b]) { // сравниваем символ с индексом a с символом с индексом b
                    return false; // если символы совпадают, значит, в слове есть дубликаты — возвращаем false
                }
            }
        }
        return true; // если все символы были проверены и ни одного совпадения не найдено, возвращаем true — все символы уникальны
    }
}