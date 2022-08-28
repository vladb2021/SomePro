package syntax;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter whole number: ");
        number = scanner.nextInt();
        scanner.close();

        System.out.println(number % 2 == 0);
    }
}
