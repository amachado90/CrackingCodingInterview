package Chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static Chapter1.Util.PrintMatrix.printMatrix;
import static org.junit.Assert.assertTrue;

/**
 * Created by Andre-PC on 9/27/2018.
 */
public class RotateMatrixTests {

    private ArraysAndStrings arraysAndStrings;

    @Before
    public void init() {
        arraysAndStrings = new ArraysAndStrings();
    }

    @Test
    public void rotateMatrixTest2x2() {
        int matrix[][] =
                {{ 1, 2},
                 { 4, 3}};
        printMatrix(matrix);
        int result[][] = arraysAndStrings.rotateMatrix(matrix);
        System.out.println("============");
        printMatrix(result);
    }

    @Test
    public void rotateMatrixTest3x3() {
        int matrix[][] =
                {{ 1, 2, 3},
                 { 8, 9, 4},
                 { 7, 6, 5}};
        printMatrix(matrix);
        int result[][] = arraysAndStrings.rotateMatrix(matrix);
        System.out.println("============");
        printMatrix(result);
    }

    @Test
    public void rotateMatrixTest4x4() {
        int matrix[][] =
                {{ 1, 2, 3, 4},
                        { 5, 6, 7, 8},
                        { 9,10,11,12},
                        {13,14,15,16}};
        printMatrix(matrix);
        int result[][] = arraysAndStrings.rotateMatrix(matrix);
        System.out.println("=================");
        printMatrix(result);
    }

    @Test
    public void rotateMatrixTest6x6() {
        int matrix[][] =
                {{ 1, 2, 3, 4, 5, 6},
                 { 7, 8, 9,10,11,12},
                 {13,14,15,16,17,18},
                 {19,20,21,22,23,24},
                 {25,26,27,28,29,30},
                 {31,32,33,34,35,36}};
        printMatrix(matrix);
        int result[][] = arraysAndStrings.rotateMatrix(matrix);
        System.out.println("=========================");
        printMatrix(result);
    }

    @After
    public void destroy() {
        arraysAndStrings = null;
    }
}
