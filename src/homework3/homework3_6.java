package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework3_6 {
    /*
                 Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
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
        boolean a = true;
        for (int i = 1; i < size; i++) {
            if (masInt[i] <= masInt[i - 1]) {
                a = false; // Проверка на возрастающую последовательность
                break;
            }
        }
        if (a) {
            System.out.println("Массив является возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является возрастающей последовательностью.");
        }
    }
}

