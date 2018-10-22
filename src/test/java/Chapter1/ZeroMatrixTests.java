package Chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static Chapter1.Util.PrintMatrix.printMatrix;

/**
 * Created by Andre-PC on 9/27/2018.
 */
public class ZeroMatrixTests {

    private ArraysAndStrings arraysAndStrings;

    @Before
    public void init() {
        arraysAndStrings = new ArraysAndStrings();
    }

    @Test
    public void zeroMatrixTest2x2() {
        int matrix[][] =
                {{ 1, 0},
                 { 4, 3}};
        printMatrix(matrix);
        int result[][] = arraysAndStrings.zeroMatrix(matrix);
        System.out.println("============");
        printMatrix(result);
    }

    @Test
    public void zeroMatrixTest3x3() {
        int matrix[][] =
                {{ 1, 2, 3},
                 { 8, 0, 4},
                 { 7, 6, 5}};
        printMatrix(matrix);
        int result[][] = arraysAndStrings.zeroMatrix(matrix);
        System.out.println("============");
        printMatrix(result);
    }

    @Test
    public void zeroMatrixTest4x4() {
        int matrix[][] =
                {{ 1, 2, 3, 4},
                        { 5, 6, 0, 8},
                        { 9,10,11,12},
                        { 0,14,15,16}};
        printMatrix(matrix);
        int result[][] = arraysAndStrings.zeroMatrix(matrix);
        System.out.println("=================");
        printMatrix(result);
    }

    @Test
    public void zeroMatrixTest6x4() {
        int matrix[][] =
                {{ 1, 2, 3, 4, 0, 6},
                 { 7, 8, 9,10,11,12},
                 {13,14,15,16,17,18},
                 {19,20,21, 0,23,24}};
        printMatrix(matrix);
        int result[][] = arraysAndStrings.zeroMatrix(matrix);
        System.out.println("=========================");
        printMatrix(result);
    }

    @After
    public void destroy() {
        arraysAndStrings = null;
    }
}
