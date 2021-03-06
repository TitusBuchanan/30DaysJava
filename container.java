import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class container {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {

            /////////// BUILD THE INPUT MATRIX///////////
            int n = in.nextInt();
            int[][] M = new int[n][n];
            for (int M_i = 0; M_i < n; M_i++) {
                for (int M_j = 0; M_j < n; M_j++) {
                    M[M_i][M_j] = in.nextInt();
                }
            }
            ////////////////////////////////////////////

            // Create a bag for the amount of each ball and the sizes of containers
            LinkedList<Integer> containers = new LinkedList<>();
            LinkedList<Integer> balls = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int rowSum = 0;
                int colSum = 0;
                for (int j = 0; j < n; j++) {
                    rowSum += M[i][j];
                    colSum += M[j][i];
                }
                balls.add(colSum);
                containers.add(rowSum);
            }

            // Check if the two bags are equal
            containers.removeAll(balls);
            if (containers.isEmpty())
                System.out.println("Possible");
            else
                System.out.println("Impossible");
        }
    }
}
