package misc.Huffman;

import java.util.Comparator;

public class DoubleNodeComparator implements Comparator<DoubleNode> {
    public int compare(DoubleNode o1, DoubleNode o2) {
        double diff = o1.getValue() - o2.getValue();
        return diff > 0 ? 1 : diff < 0 ? -1 : 0;
    }
}
