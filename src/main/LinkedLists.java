package main;

import main.util.Node;

import java.util.ArrayList;

/**
 * Created by Andre-PC on 10/10/2018.
 */
public class LinkedLists {

    public void removeDups(Node list) {
        ArrayList<Integer> buffer = new ArrayList<>();
        if (list != null) {
            Node node = list;
            buffer.add(list.data);
            while (list.next != null){
                list = list.next;
                if (buffer.contains(list.data)) {
                    if (list.next != null)
                        node.next = list.next.next;
                    else
                        node.next = null;
                } else {
                    node.next = list;
                    list = list.next;

                }

            }
        }
    }

}
