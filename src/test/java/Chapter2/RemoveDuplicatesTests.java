package Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Chapter2.util.Node;

import java.util.ArrayList;

import static Chapter2.Util.PrintNodeList.printNodeList;
import static org.junit.Assert.assertFalse;

/**
 * Created by Andre on 10/17/2018.
 */
public class RemoveDuplicatesTests {

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
    public void removeDuplicatesTest() {
        printNodeList(head);
        linkedLists.removeDups(head);
        System.out.println();
        printNodeList(head);
        ArrayList<Integer> list = new ArrayList<>();
        Node parent = head;
        do {
            assertFalse(list.contains(parent.data));
            list.add(parent.data);
        } while ((parent = parent.next) != null);
    }

    @After
    public void destroy() {
        linkedLists = null;
        head = null;
    }

}
