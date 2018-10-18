package Chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Andre-PC on 9/27/2018.
 */
public class OneAwayTests {

    private ArraysAndStrings arraysAndStrings;

    @Before
    public void init() {
        arraysAndStrings = new ArraysAndStrings();
    }

    @Test
    public void oneAwayTest1() {
        boolean result = arraysAndStrings.oneAway("", "tst");
        assertTrue(result);
    }

    @Test
    public void oneAwayTest2() {
        boolean result = arraysAndStrings.oneAway("tst", "");
        assertTrue(result);
    }

    @Test
    public void oneAwayTest3() {
        boolean result = arraysAndStrings.oneAway("", "tast");
        assertTrue(result);
    }

    @Test
    public void oneAwayTest4() {
        boolean result = arraysAndStrings.oneAway("toe", "top");
        assertTrue(result);
    }

    @After
    public void destroy() {
        arraysAndStrings = null;
    }
}
