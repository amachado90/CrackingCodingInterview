package Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Chapter2.util.Node;

import static Chapter2.Util.PrintNodeList.printNodeList;
import static org.junit.Assert.assertTrue;

/**
 * Created by Andre on 10/17/2018.
 */
public class ReturnKthToLastTests {

    private LinkedLists linkedLists;
    private Node head;

    @Before
    public void init() {
        linkedLists = new LinkedLists();
        head = new Node(0);
        head.appendToTail(3);
        head.appendToTail(5);
        head.appendToTail(5);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(3);
    }

    @Test
    public void returnKthToLastTest() {
        printNodeList(head);
        Node kthToLastNode = linkedLists.returnKthFromLastNode(head, 3);
        assertTrue(kthToLastNode.data == 1);
    }

    @Test
    public void returnKthToLastTest2() {
        printNodeList(head);
        Node kthToLastNode = linkedLists.returnKthFromLastNode(head, 5);
        assertTrue(kthToLastNode.data == 4);
    }

    @Test
    public void returnKthToLastTest3() {
        printNodeList(head);
        Node kthToLastNode = linkedLists.returnKthFromLastNode(head, 10);
        assertTrue(kthToLastNode.data == 0);
    }

    @After
    public void destroy() {
        linkedLists = null;
        head = null;
    }

}
