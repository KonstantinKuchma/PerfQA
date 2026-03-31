package homework4_1;

/*
        ЗСоздать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
         */
public class Main {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();// создание первой кредитной карты
        creditCard.number = 123456789;
        creditCard.summa = 100.00;

        CreditCard creditCard1 = new CreditCard();// создание второй кредитной карты
        creditCard1.number = 987654321;
        creditCard1.summa = 200.00;

        CreditCard creditCard2 = new CreditCard();// создание третьей кредитной карты
        creditCard2.number = 555555555;
        creditCard2.summa = 300.00;

        creditCard.todeposit(10.5);
        creditCard1.todeposit(50.1);
        creditCard2.towithdraw(100.4);

        creditCard.info();
        System.out.println();
        creditCard1.info();
        System.out.println();
        creditCard2.info();
    }
}
