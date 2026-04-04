package homework7;

import java.util.Scanner;

public class homework7_1 {
    /*
   Задача 1:
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создание сканера

        System.out.println("Введите три строки");
        String stroka1 = scanner.nextLine(); // вводим три строки
        String stroka2 = scanner.nextLine();
        String stroka3 = scanner.nextLine();

        String shortest = stroka1; // преддполагаем, что первая строка самая короткая
        String longest = stroka1;// преддполагаем, что первая строка самая длинная

        if (stroka2.length() < shortest.length()) { // поиск самой короткой строки
            shortest = stroka2;
        }
        if (stroka3.length() < shortest.length()) {
            shortest = stroka3;
        }

        if (stroka2.length() > longest.length()) { // Поиск самой длинной строки
            longest = stroka2;
        }
        if (stroka3.length() > longest.length()) {
            longest = stroka3;
        }

        System.out.println("Самая короткая строка - " + shortest + ". Её длина: " + shortest.length());
        System.out.println("Самая длинная строка - " + longest + ". Её длина: " + longest.length());

        scanner.close();
    }
}
