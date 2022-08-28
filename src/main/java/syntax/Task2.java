package syntax;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        boolean b1, b2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter b1: ");
        b1 = scanner.nextBoolean();
        System.out.println("Enter b2: ");
        b2 = scanner.nextBoolean();
        scanner.close();

        System.out.println(b1==b2);
    }
}
