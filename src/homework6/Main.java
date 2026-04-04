package homework6;

public class Main {
    public static void main(String[] args) {
        Homework6_1 homework6_1 = new Homework6_1();
        System.out.println("1 метод c try-catch");
        homework6_1.onecatch();
        System.out.println();
        System.out.println("2 метод c try-catch с несколькими catch");
        homework6_1.twocatch();
        System.out.println();
        System.out.println("3 метод c multicatch");
        homework6_1.multicatch();
        System.out.println();
        System.out.println("4 метод c try-catch-finally");
        homework6_1.catchfinally();
    }
}
