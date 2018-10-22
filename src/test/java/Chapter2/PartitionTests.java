package Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Chapter2.util.Node;

import static Chapter2.Util.PrintNodeList.printNodeList;

/**
 * Created by Andre on 10/17/2018.
 */
public class PartitionTests {

    private LinkedLists linkedLists;
    private Node head;

    @Before
    public void init() {
        linkedLists = new LinkedLists();
        head = new Node(3);
    }

    @Test
    public void partitionTest() {
        head.appendToTail(5);
        head.appendToTail(8);
        head.appendToTail(5);
        head.appendToTail(10);
        head.appendToTail(2);
        head.appendToTail(1);
        printNodeList(head);
        Node newList = linkedLists.partition(head, 5);
        printNodeList(newList);
    }

    @Test
    public void partitionTest2() {
        head.appendToTail(6);
        head.appendToTail(1);
        head.appendToTail(3);
        head.appendToTail(10);
        head.appendToTail(7);
        head.appendToTail(6);
        head.appendToTail(9);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(2);
        head.appendToTail(9);
        head.appendToTail(9);
        head.appendToTail(8);
        printNodeList(head);
        Node newHead = linkedLists.partition(head, 8);
        printNodeList(newHead);
    }

    @After
    public void destroy() {
        linkedLists = null;
        head = null;
    }
}
