package homework4_2;

public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(1, 1, 1); // cоздаём банкомат

        bankomat.addCash(1, 1, 1); // добавляем деньги в банкомат

        boolean success = bankomat.withdraw(110); // снимаем деньги
        System.out.println("Снятие успешно: " + success);

    }
}
