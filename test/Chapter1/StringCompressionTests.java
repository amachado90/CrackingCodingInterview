package Chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Andre-PC on 9/27/2018.
 */
public class StringCompressionTests {

    private ArraysAndStrings arraysAndStrings;

    @Before
    public void init() {
        arraysAndStrings = new ArraysAndStrings();
    }

    @Test
    public void stringCompressionTest1() {
        String result = arraysAndStrings.stringCompression("aabcccccaaa");
        String expected = "a2b1c5a3";
        assertEquals(expected, result);
    }

    @Test
    public void stringCompressionTest2() {
        String result = arraysAndStrings.stringCompression("helloworld");
        String expected = "h1e1l2o1w1o1r1l1d1";
        assertEquals(expected, result);
    }

    @After
    public void destroy() {
        arraysAndStrings = null;
    }
}
