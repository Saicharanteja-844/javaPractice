//create a 2d array of size 5 * 6  use loop to fill the matrix

import java.util.*;

class ArraySample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][6];
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = ++k;
            }
        }
        // print column-wise: iterate over columns then rows
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
