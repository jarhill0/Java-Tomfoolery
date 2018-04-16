package misc.Huffman;

import java.util.HashMap;
import java.util.PriorityQueue;

class Encoded {
    public String encoded;
    public DoubleNode tree;

    public Encoded(String encoded, DoubleNode tree) {
        this.encoded = encoded;
        this.tree = tree;
    }
}

public class Huffman {
    // Note: This class encodes messages to strings of 1s and 0s, which is not the most accurate. Technically, it should
    //       be encoding to bits. However, this is trivial to change, and could be adapted before writing to a file, or
    //       something like that.

    public static String ZERO = "0";
    public static String ONE = "1";


    public static Encoded encode(String message) {
        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
        for (Character c : message.toCharArray()) {
            if (counts.containsKey(c))
                counts.put(c, 1 + counts.get(c));
            else
                counts.put(c, 1);
        }


        int length = message.length();
        HashMap<Character, Double> proportionCounts = new HashMap<Character, Double>();
        for (Character c : counts.keySet())
            proportionCounts.put(c, ((double) counts.get(c) / length));


        PriorityQueue<DoubleNode> queue = new PriorityQueue<DoubleNode>(length, new DoubleNodeComparator());
        for (Character c : proportionCounts.keySet())
            queue.add(new DoubleNode(proportionCounts.get(c), Character.toString(c)));


        while (queue.size() > 1) {
            DoubleNode a = queue.poll();
            DoubleNode b = queue.poll();

            DoubleNode blankNode = new DoubleNode(a.getValue() + b.getValue());
            blankNode.setLeftNode(a);
            blankNode.setRightNode(b);
            queue.add(blankNode);
        }

        DoubleNode tree = queue.poll();
        HashMap<String, String> codeTable = traverse(tree);
        StringBuilder encodedString = new StringBuilder();
        for (char c : message.toCharArray())
            encodedString.append(codeTable.get(Character.toString(c)));


        return new Encoded(encodedString.toString(), tree);
    }


    private static HashMap<String, String> traverse(DoubleNode tree) {
        HashMap<String, String> map = new HashMap<String, String>();
        traverseHelper(tree, "", map); // populates the HashMap
        return map;
    }

    private static void traverseHelper(DoubleNode node, String path, HashMap<String, String> map) {
        if (node.isLeaf())
            map.put(node.getLabel(), path);
        else {
            traverseHelper(node.getLeftNode(), path + ZERO, map);  //recursively traverse left
            traverseHelper(node.getRightNode(), path + ONE, map);  // traversals can assume that if a node is not a leaf, it has both a left and right node.
        }
    }

    public static String decode(String encodedMessage, DoubleNode tree) {
        StringBuilder message = new StringBuilder();
        DoubleNode currentNode = tree; // meant to be reassigned as we traverse the tree
        for (char c : encodedMessage.toCharArray()) {
            if (Character.toString(c).equals(ZERO))
                currentNode = currentNode.getLeftNode();
            else
                currentNode = currentNode.getRightNode();

            if (currentNode.isLeaf()) {
                message.append(currentNode.getLabel());
                currentNode = tree; // reset traversal to the top of the tree
            }
        }
        return message.toString();
    }

    public static String decode(Encoded encoded) {
        return decode(encoded.encoded, encoded.tree);
    }

    public static void main(String[] args) {
        Encoded encoded = encode("The intent is to provide players with a sense of pride and accomplishment for " +
                "unlocking different heroes. As for cost, we selected initial values based upon data from the Open Beta" +
                " and other adjustments made to milestone rewards before launch. Among other things, we're looking at " +
                "average per-player credit earn rates on a daily basis, and we'll be making constant adjustments to " +
                "ensure that players have challenges that are compelling, rewarding, and of course attainable via " +
                "gameplay. We appreciate the candid feedback, and the passion the community has put forth around the " +
                "current topics here on Reddit, our forums and across numerous social media outlets. Our team will " +
                "continue to make changes and monitor community feedback and update everyone as soon and as often as we can.");
        System.out.println(encoded.encoded);
        System.out.printf("Encoded size: %d\n", encoded.encoded.length());
        System.out.println(decode(encoded));
        System.out.printf("Decoded size: %d\n", decode(encoded).length() * 8);
    }
}
