package syntax;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter value of b: ");
        b = scanner.nextInt();
        scanner.close();

        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);
    }
}
