package Chapter1.Util;

/**
 * Created by Andre on 10/17/2018.
 */
public class PrintMatrix {



    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i< matrix.length; i++) {
            StringBuilder printme = new StringBuilder();
            printme.append("[ ");
            for (int j = 0; j<matrix.length; j++) {
                printme.append(String.format("%02d", matrix[i][j]));
                printme.append(", ");
            }
            printme.replace(printme.lastIndexOf(","), printme.lastIndexOf(",")+1, "]");
            System.out.println(printme.toString());
        }
    }

}
