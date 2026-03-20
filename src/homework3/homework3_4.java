package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework3_4 {
    /*
           Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
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

        int zero = 0;
        for (int element : masInt) {
            if (element == 0) {
                zero++;// Подсчёт количества нулевых элементов
            }
        }

        if (zero > 0) {
            System.out.println("Количество нулевых элементов: " + zero);
        } else {
            System.out.println("Нулевых элементов в массиве нет.");
        }
    }
}
