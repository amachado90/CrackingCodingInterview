package Chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Andre-PC on 9/27/2018.
 */
public class IsUniqueTests {

    private ArraysAndStrings arraysAndStrings;

    @Before
    public void init() {
        arraysAndStrings = new ArraysAndStrings();
    }

    @Test
    public void isUniqueTest1() {
        boolean unique = arraysAndStrings.isUnique("abc");
        assertTrue(unique);
    }

    @Test
    public void isUniqueTest2() {
        boolean unique = arraysAndStrings.isUnique("TEST");
        assertFalse(unique);
    }

    @Test
    public void isUniqueTest3() {
        boolean unique = arraysAndStrings.isUnique("Tt");
        assertTrue(unique);
    }

    @After
    public void destroy() {
        arraysAndStrings = null;
    }
}
