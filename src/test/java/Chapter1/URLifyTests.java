package Chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by Andre-PC on 9/27/2018.
 */
public class URLifyTests {

    private ArraysAndStrings arraysAndStrings;

    @Before
    public void init() {
        arraysAndStrings = new ArraysAndStrings();
    }

    @Test
    public void URLifyTest1() {
        char[] exp = "Mr%20John%20Smith".toCharArray();
        char[] actual = arraysAndStrings.URLify("Mr John Smith    ".toCharArray(), 13);
        assertTrue(Arrays.equals(exp, actual));
    }

    @After
    public void destroy() {
        arraysAndStrings = null;
    }
}
