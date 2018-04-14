package misc.Huffman;


public class DoubleNode {
    private double value;
    private String label;
    private DoubleNode leftNode;
    private DoubleNode rightNode;

    public DoubleNode(double value, String label) {
        this.value = value;
        this.label = label;
    }

    public DoubleNode(double value) {
        this(value, "");
    }

    public void setLeftNode(DoubleNode node) {
        leftNode = node;
    }

    public void setRightNode(DoubleNode node) {
        rightNode = node;
    }

    public DoubleNode getLeftNode() {
        return leftNode;
    }

    public DoubleNode getRightNode() {
        return rightNode;
    }

    public double getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public boolean isLeaf() {
        return leftNode == null && rightNode == null;
    }


}
