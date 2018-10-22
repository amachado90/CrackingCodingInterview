package Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Chapter2.util.Node;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by Andre on 10/17/2018.
 */
public class Intersecting {

    private LinkedLists linkedLists;

    @Before
    public void init() {
        linkedLists = new LinkedLists();
    }

    @Test
    public void noIntersection() {
        Node a = new Node(1);
        a.appendToTail(2);
        a.appendToTail(3);
        a.appendToTail(4);
        a.appendToTail(5);
        a.appendToTail(6);
        Node b = new Node(1);
        b.appendToTail(2);
        b.appendToTail(3);
        b.appendToTail(4);
        b.appendToTail(5);
        b.appendToTail(6);
        Node result = linkedLists.intersecting(a, b);
        assertNull(result);
    }

    @Test
    public void instersection() {
        Node intersection = new Node(7);
        Node a = new Node(1);
        a.next = intersection;
        a.appendToTail(2);
        a.appendToTail(3);
        a.appendToTail(4);
        a.appendToTail(5);
        a.appendToTail(6);
        Node b = new Node(1);
        b.next = intersection;
        b.appendToTail(2);
        b.appendToTail(3);
        b.appendToTail(4);
        b.appendToTail(5);
        b.appendToTail(6);
        Node result = linkedLists.intersecting(a, b);
        assertNotNull(result);
        assertEquals(7, result.data);
    }

    @After
    public void destroy() {
        linkedLists = null;
    }
}
