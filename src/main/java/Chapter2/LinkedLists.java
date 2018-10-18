package Chapter2;

import util.Node;
import java.util.ArrayList;

/**
 * Created by Andre-PC on 10/10/2018.
 */
public class LinkedLists {

    public Node removeDups(Node head) {
        ArrayList<Integer> buffer = new ArrayList<>();
        Node current = head;
        do {
            buffer.add(current.data);
            while ((current.next != null) && buffer.contains(current.next.data))
                current.next = current.next.next;
        } while ((current = current.next) != null);
        return head;
    }

    public Node returnKthFromLastNode(Node parent, int kth) {
        int count = 1;
        Node current = parent;

        while ((current = current.next) != null) {
            count++;
        }

        current = parent;
        int i = 0;
        while ((i < (count-kth)) && (current.next != null)) {
            current = current.next;
            i++;
        }
        return current;
    }

    public void deleteMiddleNode(Node n) {
        n.data = n.next.data;
        n.next = n.next.next;
    }

    public Node partition(Node head, int partition) {
        Node beforePartition = null;
        Node afterPartition = null;
        Node current = head;
        do {
            if ((beforePartition == null) && current.data < partition) {
                beforePartition = new Node(current.data);
            } else if ((beforePartition != null) && current.data < partition) {
                beforePartition.appendToTail(current.data);
            }
            if ((afterPartition == null) && current.data >= partition) {
                afterPartition = new Node(current.data);
            } else if ((afterPartition != null) && current.data >= partition) {
                afterPartition.appendToTail(current.data);
            }
        } while ((current = current.next) != null);

        if (beforePartition != null) {
            if (afterPartition != null) {
                do {
                    beforePartition.appendToTail(afterPartition.data);
                } while ((afterPartition = afterPartition.next) != null);
            }
            return beforePartition;
        } else {
            return afterPartition;
        }
    }

    public Node sumLists(Node a, Node b) {
        Node returnNode;
        String first = "";
        String second = "";
        do {
            first = a.data + first;
        } while ((a = a.next) != null);
        do {
            second = b.data + second;
        } while ((b = b.next) != null);
        int sum = Integer.parseInt(first)+Integer.parseInt(second);
        String sumString = ""+sum;
        returnNode = new Node(Integer.parseInt(""+sumString.charAt(sumString.length()-1)));
        for (int i = sumString.length()-1; i>0; i--) {
            int nodeInt = Integer.parseInt(""+sumString.charAt(i-1));
            returnNode.appendToTail(nodeInt);
        }

        return returnNode;
    }
}
