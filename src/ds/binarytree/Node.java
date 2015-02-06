package ds.binarytree;

/**
 * Created by Jainik on 1/29/2015.
 */
public class Node {
    private int data;
    private Node leftNode;
    private Node rightNode;

    public Node(int data) {
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public int getData() {

        return data;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
