package homework5_1;

public class Dantist extends Doctor { // класс дантист со своим переопределенным методом

    @Override
    public void treat() { // переопределяем метод
        System.out.println("Пациенту необходимо вырвать зуб");
    }
}
