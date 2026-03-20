package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework3_5 {
    /*
              Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
               */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // Создаём объект класса Random
        System.out.print("Введите размер массива: ");  // Ввод размера массива
        int size = scanner.nextInt();

        int[] masInt = new int[size];  // Cоздание массива заданного размера

        for (int i = 0; i < size; i++) {
            masInt[i] = random.nextInt(101); // Заполнение массива случайными целыми числами с помощью Random
        }
        System.out.println(Arrays.toString(masInt));// Вывод массива
        for (int i = 0; i < size / 2; i++) { // Объявляем временную переменную
            int a = masInt[i];
            masInt[i] = masInt[size - 1 - i];
            masInt[size - 1 - i] = a; // Меняем местами i‑й элемент и симметричный ему с конца
        }

        System.out.println("Массив после перестановки: " + java.util.Arrays.toString(masInt)); // Вывод массива после перстановки
    }
}
