package homework5_2;

/*
Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве
 */
public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5]; // создаем массив

        figuras[0] = new Rectangle(2, 3); // заполняем массив фигурами
        figuras[1] = new Triangle(2, 5, 3);
        figuras[2] = new Circle(4);
        figuras[3] = new Triangle(7, 5, 2);
        figuras[4] = new Rectangle(7, 8);

        double summaPerimeter = 0;
        for (Figura figura : figuras) {
            summaPerimeter += figura.Perimeter();
        }

        System.out.println("Сумма периметров всех фигур в массиве: " + summaPerimeter);
    }
}
