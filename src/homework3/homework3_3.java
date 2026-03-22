package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework3_3 {
    /*
        Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
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
        System.out.println(Arrays.toString(masInt));// Вывод изначального массива
        Arrays.sort(masInt); // соритровка массива
        System.out.println("Отсортированный массив: " + Arrays.toString(masInt));// Вывод отсортированного массива
        int minValue = masInt[0]; // В отсортированном массиве первый элемент минимальный
        int maxValue = masInt[size - 1]; // В отсортированном массиве последний элемент максимальный
        int indexOfMin = Arrays.binarySearch(masInt, minValue);
        int indexOfMax = Arrays.binarySearch(masInt, maxValue);
        System.out.println("Индекс минимального элемента: " + indexOfMin);
        System.out.println("Индекс максимального элемента: " + indexOfMax);
    }
}
