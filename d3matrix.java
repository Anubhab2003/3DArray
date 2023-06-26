import java.util.*;

public class d3matrix {

    public static void main(String[] args) {
        int matrix[][][] = new int[2][2][2];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements");

        // int x = 0;
        // int y = 0;
        // int z = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    matrix[i][j][k] = s.nextInt();
                }
            }
        }

        // output
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(matrix[i][j][k] + "| ");
                }
                System.out.println();
            }
        }
    }
}
