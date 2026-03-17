package homework1;

public class homework1_3 {

    public static void main(String[] args) {
        int n = 126;
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = (n / 100) % 10;
        int d = a + b + c;

        System.out.println(d);
    }
}
