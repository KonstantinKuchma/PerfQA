package homework5_2;

public class Rectangle extends Figura { // создаем класс прямоугольник

    double x; // длина одной стороны прямоугольника
    double y; // длина второй стороны прямоугольника

    public Rectangle(double x, double y) { // создаем конструктор
        this.x = x;
        this.y = y;
    }

    @Override
    public double Area() { // переопределяем метод расчета площади (произведение двух сторон)
        return x * y;
    }

    @Override
    public double Perimeter() { // переопределяем метод расчета периметра (периметр = сумма длинн всех сторон)
        return 2 * (x + y);
    }
}
