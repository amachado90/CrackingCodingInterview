package Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Chapter2.util.Node;

import static org.junit.Assert.*;

/**
 * Created by Andre on 10/17/2018.
 */
public class loopDetection {

    private LinkedLists linkedLists;
    private Node head;

    @Before
    public void init() {
        linkedLists = new LinkedLists();
    }

    @Test
    public void loopDetection1() {
        head = new Node(1);
        Node second = new Node(5);
        Node loopA = new Node(10);
        Node loopB = new Node(11);
        Node loopC = new Node(12);
        head.next = second;
        second.next = loopA;
        loopA.next = loopB;
        loopB.next = loopC;
        loopC.next = loopA;
        Node loopNode = linkedLists.loopDetection(head);
        assertEquals(loopA, loopNode);
        assertEquals(loopA.data, loopNode.data);
    }

    @Test
    public void loopDetection2() {
        head = new Node(1);
        Node second = new Node(5);
        Node loopA = new Node(10);
        Node loopB = new Node(11);
        Node loopC = new Node(12);
        head.next = second;
        second.next = loopA;
        loopA.next = loopB;
        loopB.next = loopC;
        loopC.next = loopA;
        Node loopNode = linkedLists.loopDetection(head);
        assertNotEquals(second, loopNode);
        assertNotEquals(second.data, loopNode.data);

    }

    @After
    public void destroy() {
        linkedLists = null;
        head = null;
    }
}
