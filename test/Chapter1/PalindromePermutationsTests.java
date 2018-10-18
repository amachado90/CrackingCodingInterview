package Chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Andre-PC on 9/27/2018.
 */
public class PalindromePermutationsTests {

    private ArraysAndStrings arraysAndStrings;

    @Before
    public void init() {
        arraysAndStrings = new ArraysAndStrings();
    }

    @Test
    public void palindromePermutationsTest1() {
        boolean result = arraysAndStrings.palindromePermutation("Tact oac");
        assertTrue(result);
    }

    @Test
    public void palindromePermutationsTest2() {
        boolean result = arraysAndStrings.palindromePermutation("test act");
        assertFalse(result);
    }

    @After
    public void destroy() {
        arraysAndStrings = null;
    }
}
