package arrays;

public class MultiTable {
    public static void main(String[] args) {

        int[][] array = new int[10][10];
        int i,j;

        for (i=0;i<10;i++) {
            for (j=0;j<10;j++) {
                array[i][j] = (i+1)*(j+1);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}