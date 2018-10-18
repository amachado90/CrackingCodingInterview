package Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.Node;

import static Chapter2.Util.PrintNodeList.printNodeList;

/**
 * Created by Andre on 10/17/2018.
 */
public class DeleteMiddleNodeTest {

    private LinkedLists linkedLists;
    private Node head;

    @Before
    public void init() {
        linkedLists = new LinkedLists();
        head = new Node(0);
    }

    @Test
    public void deleteMiddleNodeTest() {
        Node n = new Node(4);
        head.next = n;
        head.appendToTail(3);
        printNodeList(head);
        linkedLists.deleteMiddleNode(n);
        printNodeList(head);
    }

    @After
    public void destroy() {
        linkedLists = null;
        head = null;
    }
}
