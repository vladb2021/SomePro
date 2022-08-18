package arrays;
import java.util.Random;

public class CopyArray {
    public static void main(String[] args) {

        int i;
        int[] array = new int[4];
        int[] array2 = new int[4];
        Random random = new Random();

        for (i=0; i<array.length; i++) {
            array[i] = random.nextInt();
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (i=0; i<array2.length; i++) {
            array2[i] = array[i];
            System.out.print(array2[i] + "\t");
        }
    }
}
