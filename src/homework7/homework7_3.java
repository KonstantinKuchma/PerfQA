package homework7;

import java.util.Scanner;

public class homework7_3 {
    /*
    Задача 3:
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создание сканера

        System.out.println("Введите три строки");
        String stroka1 = scanner.nextLine(); // вводим три строки
        String stroka2 = scanner.nextLine();
        String stroka3 = scanner.nextLine();

        int summa = stroka1.length() + stroka2.length() + stroka3.length(); // считаем общую длину строк
        double average = summa / 3.0; // считаем среднюю арифметическую длину строк
        System.out.println("Средняя длина строки " + average);

        if (stroka1.length() < average) {  // выводим строки есди их длина меньше средней
            System.out.println("Строка один: " + stroka1 + ", её длина: " + stroka1.length() + " - меньше средней");
        }
        if (stroka2.length() < average) {
            System.out.println("Строка два: " + stroka2 + ", её длина: " + stroka2.length() + " - меньше средней");
        }
        if (stroka3.length() < average) {
            System.out.println("Строка три: " + stroka3 + ", её длина: " + stroka3.length() + " - меньше средней");
        }

        scanner.close();
    }
}
