package homework4_2;

public class Bankomat {

    int count20; // количество купюр номиналом 20
    int count50; // количество купюр номиналом 50
    int count100; // количество купюр номиналом 100

    public Bankomat(int count20, int count50, int count100) { // конструктор
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void addCash(int add20, int add50, int add100) { // метод для добавления денег в банкомат
        count20 += add20;
        count50 += add50;
        count100 += add100;
    }

    public boolean withdraw(int summa) { // функция, снимающая деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения операции.
        if (summa % 10 != 0) { // проверяем, что сумма кратна 10, если не кратна то не сможем выдать купюры
            System.out.println("сумма должна быть кратной 10.");
            return false;
        }

        int cashin = count20 * 20 + count50 * 50 + count100 * 100; // считаем какая сумма в банкомате
        if (cashin < summa) { // сравниваем сумму в банкомате с запрошенной
            System.out.println("недостаточно средств в банкомате.");
            return false;
        }

        int give20 = 0, give50 = 0, give100 = 0;  // создаем переменные для запоминания кол-ва выдаваемых купюр
        int summa1 = summa;

        give100 = Math.min(summa1 / 100, count100); // выдача по 100
        summa1 -= give100 * 100;

        give50 = Math.min(summa1 / 50, count50); // выдача по 50
        summa1 -= give50 * 50;

        give20 = Math.min(summa1 / 20, count20); // выдача по 20
        summa1 -= give20 * 20;

        if (summa1 != 0) {
            System.out.println("запрошенную сумму невозможно выдать с имеющимся набором купюр.");
            return false;
        }

        count100 -= give100; //остаток 100
        count50 -= give50; //остаток 50
        count20 -= give20; //остаток 20

        System.out.println(summa + "выдана купюрами ");  // инфо о выданных купюрах
        if (give100 > 0) System.out.println(give100 + " по 100");
        if (give50 > 0) System.out.println(give50 + " по 50");
        if (give20 > 0) System.out.println(give20 + " по 20");

        return true;
    }
}
