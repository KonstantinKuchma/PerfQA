package homework5_1;

public class Hirurg extends Doctor { // класс хирург со своим переопределенным методом

    @Override
    public void treat() { // переопределяем метод
        System.out.println("Пациенту необходимо вырезать аппендицит");
    }
}
