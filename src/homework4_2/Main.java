package homework4_2;

public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(10, 10, 10); // cоздаём банкомат

        bankomat.addCash(5, 2, 1); // добавляем деньги в банкомат

        boolean success = bankomat.withdraw(250); // снимаем деньги
        System.out.println("Снятие успешно: " + success);

    }
}
