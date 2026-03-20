package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework3_2 {
    /*
        Задача 2:
Найти минимальный - максимальный элементы и вывести в консоль.
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
        Arrays.sort(masInt); // соритровка массива
        System.out.println("Отсортированный массив: " + Arrays.toString(masInt));// Вывод отсортированного массива
        int minValue = masInt[0]; // В отсортированном массиве первый элемент минимальный
        int maxValue = masInt[size - 1]; // В отсортированном массиве последний элемент максимальный
        System.out.println("Минимальный элемент: " + minValue);
        System.out.println("Максимальный элемент: " + maxValue);
    }
}