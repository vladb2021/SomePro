package syntax;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter value of b: ");
        b = scanner.nextInt();
        scanner.close();

        System.out.println((a==b)||((a<0)&&(b>0))||((a>100)&&(b>100)));
    }
}
