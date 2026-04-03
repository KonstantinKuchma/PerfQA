package homework7;

import java.util.Scanner;

public class homework7_2 {
    /*
    Задача 2:
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создание сканера

        System.out.println("Введите три строки");
        String[] strings = new String[3];
        strings[0] = scanner.nextLine();
        strings[1] = scanner.nextLine();
        strings[2] = scanner.nextLine();

        for (int i = 0; i < strings.length - 1; i++) { // сортировка по длине строк
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (strings[j].length() > strings[j + 1].length()) { // меняем строки местами
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        System.out.println("Строки в порядке возрастания их длины:");
        for (String str : strings) {
            System.out.println(str + " (длина: " + str.length() + ")");
        }

        scanner.close();
    }
}
