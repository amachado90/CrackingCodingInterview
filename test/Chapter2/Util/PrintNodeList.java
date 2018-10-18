package Chapter2.Util;

import util.Node;

/**
 * Created by Andre on 10/17/2018.
 */
public class PrintNodeList {

    public static void printNodeList(Node current) {
        StringBuilder sb = new StringBuilder("\""+current.data+"\"");
        while ((current = current.next) != null) {
            sb.append(" -> ");
            sb.append("\"");
            sb.append(current.data);
            sb.append("\"");
        }
        System.out.println(sb.toString());
    }
}
