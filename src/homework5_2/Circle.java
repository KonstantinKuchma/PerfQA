package homework5_2;

public class Circle extends Figura { // создаем класс круг
    double r; // длина радиуса окружности

    public Circle(double r) { // создаем конструктор
        this.r = r;
    }

    @Override
    public double Area() { // переопределяем метод расчета площади (πr2)
        return Math.PI * r * r;
    }

    @Override
    public double Perimeter() { // переопределяем метод расчета периметра (2πr)
        return 2 * Math.PI * r;
    }
}
