package homework8;

public class Main {

    public static void main(String[] args) {
        homework8_2 zoo = new homework8_2();
        zoo.printCollection();
        zoo.addAnimal("Собака");
        zoo.addAnimal("Кошка");
        zoo.addAnimal("Тигр");
        zoo.printCollection();
        zoo.removeAnimal();
        zoo.printCollection();
    }
}
