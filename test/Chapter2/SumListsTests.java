package Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.Node;

import static Chapter2.Util.PrintNodeList.printNodeList;

/**
 * Created by Andre on 10/17/2018.
 */
public class SumListsTests {

    private LinkedLists linkedLists;
    private Node head;

    @Before
    public void init() {
        linkedLists = new LinkedLists();
    }

    @Test
    public void partitionTest() {
        Node a = new Node(0);
        a.appendToTail(0);
        a.appendToTail(2);
        Node b = new Node(8);
        b.appendToTail(2);
        b.appendToTail(4);
        printNodeList(a);
        printNodeList(b);
        head = linkedLists.sumLists(a,b);
        printNodeList(head);
    }

    @After
    public void destroy() {
        linkedLists = null;
        head = null;
    }
}
