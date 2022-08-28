package syntax;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        boolean value;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter boolean value: ");
        value = scanner.nextBoolean();
        scanner.close();

        System.out.println(!value);
    }
}
