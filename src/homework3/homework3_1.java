package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework3_1 {
    /*
        Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
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
        System.out.println(Arrays.toString(masInt));// Вывод элементов в прямом порядке
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(masInt[i] + " ");// Вывод элементов в обратном порядке
        }
    }
}
