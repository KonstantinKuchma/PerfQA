package homework5_1;

public class Terapevt extends Doctor { // класс терпевт со своим переопределенным методом лечить и методом назначения врача
    @Override
    public void treat() { // переопределенный метод лечить
        System.out.println("Пациенту необходимо пропить витамины");
    }

    public void naznachenie(Pathient pathient) { // свой метод выборв врача
        int code1 = pathient.code;
        Doctor doctor;

        if (code1 == 1) { // задаем возможные варианты лечения
            doctor = new Hirurg();
            System.out.println("Пациенту назначен хирург");

        } else if (code1 == 2) {
            doctor = new Dantist();
            System.out.println("Пациенту назначен дантист");

        } else {
            doctor = new Terapevt();
            System.out.println("Пациенту назначен терапевт");
        }

        doctor.treat();
    }
}
