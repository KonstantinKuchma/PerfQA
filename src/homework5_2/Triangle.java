package homework5_2;

public class Triangle extends Figura { // создаем класс треугольник

    double a; // длина одной стороны треугольника
    double b; // длина второй стороны треугольника
    double c; // длина третьей стороны треугольника

    public Triangle(double a, double b, double c) { // создаем конструктор
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double Area() { // переопределяем метод расчета площади (формула Герона через полупериметр)
        double d = (a + b + c) / 2; // считаем полупериметр
        return Math.sqrt(d * (d - a) * (d - b) * (d - c)); // считаем площадь
    }

    @Override
    public double Perimeter() { // переопределяем метод расчета периметра (периметр = сумма длинн всех сторон a + b + c)
        return a + b + c;
    }
}
