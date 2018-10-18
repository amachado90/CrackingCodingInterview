package Chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Andre-PC on 9/27/2018.
 */
public class CheckPermutationTests {

    private ArraysAndStrings arraysAndStrings;

    @Before
    public void init() {
        arraysAndStrings = new ArraysAndStrings();
    }

    @Test
    public void checkPermTest1() {
        boolean unique = arraysAndStrings.checkPermutation("hello world", "hellloowrd");
        assertTrue(unique);
    }

    @Test
    public void checkPermTest2() {
        boolean unique = arraysAndStrings.checkPermutation("career", "reaecr");
        assertTrue(unique);
    }

    @Test
    public void checkPermTest3() {
        boolean unique = arraysAndStrings.checkPermutation("rat race", "race cat");
        assertFalse(unique);
    }

    @After
    public void destroy() {
        arraysAndStrings = null;
    }
}
