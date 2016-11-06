import java.util.Scanner;

public class MatrixAddition {

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       int[][] a = new int[3][3];
       int[][] b = new int[3][3];
       System.out.println("Enter the first matrix");
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               a[i][j] = s.nextInt();
           }
       }
       System.out.println("Enter the second matrix");
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               b[i][j] = s.nextInt();
           }
       }
       int[][] c = new int[3][3];
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               c[i][j] = a[i][j] + b[i][j];
           }
       }
       System.out.println("The sum of the two matrices is");
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               System.out.print(c[i][j] + " ");
           }
           System.out.println();
       }
   }
}
