package Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Chapter2.util.Node;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Andre on 10/17/2018.
 */
public class IsPalindrome {

    private LinkedLists linkedLists;
    private Node head;

    @Before
    public void init() {
        linkedLists = new LinkedLists();
    }

    @Test
    public void notPalindromeTest() {
        head = new Node(1);
        head.appendToTail(0);
        head.appendToTail(0);
        head.appendToTail(0);
        head.appendToTail(0);
        head.appendToTail(0);
        assertFalse(linkedLists.isPalindrome(head));
    }

    @Test
    public void isPalindromeTest() {
        head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(4);
        head.appendToTail(6);
        head.appendToTail(6);
        head.appendToTail(4);
        head.appendToTail(2);
        head.appendToTail(1);
        assertTrue(linkedLists.isPalindrome(head));
    }

    @After
    public void destroy() {
        linkedLists = null;
        head = null;
    }
}
