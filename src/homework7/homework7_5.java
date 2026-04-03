package homework7;

import java.util.Scanner;

public class homework7_5 {
    /*
    Задача 5:
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создание сканера

        System.out.println("Введите строку");
        String stroka1 = scanner.nextLine(); // вводим строку

        StringBuilder stroka2 = new StringBuilder();
        for (char i : stroka1.toCharArray()) { // делаем массив и проходим по элементам
            stroka2.append(i).append(i); // добавляем символ дважды
        }
        System.out.println(stroka2);

        scanner.close();
    }
}
