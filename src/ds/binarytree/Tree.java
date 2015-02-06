package ds.binarytree;

import java.util.Stack;

/**
 * Created by Jainik on 1/29/2015.
 */
public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        Node currentNode = null;
        Node parentNode = null;
        if(root == null) {
            root = newNode;
        } else {
            currentNode = root;

            while(true) {
                parentNode = currentNode;
                if(newNode.getData() < currentNode.getData()) {
                    currentNode = parentNode.getLeftNode();
                    if(currentNode == null) {
                        parentNode.setLeftNode(newNode);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRightNode();
                    if(currentNode == null) {
                        parentNode.setRightNode(newNode);
                        return;
                    }
                }
            }
         }

    }

    public Node find(int data) {
        Node current = root;
        while(data != current.getData()) {
            if(data < current.getData())
                current = current.getLeftNode();
            else
                current = current.getRightNode();
        }
        return current;
    }

    public boolean deleteNode(int data) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = false;

        while(current.getData() != data) {
            parent = current;
            if(data < current.getData()) {
                current = current.getLeftNode();
                isLeftChild = true;
            }
            else
                current = current.getRightNode();

            if(current == null)
                return false;
        }

        // no children
        if(current.getLeftNode() == null && current.getRightNode() == null) {
            if(current == root) {
                root = null;
            } else if(isLeftChild) {
                parent.setLeftNode(null);
            } else {
                parent.setRightNode(null);
            }
        }
        // left children
        else if(current.getRightNode() == null) {
            if(current == root)
                root = current.getLeftNode();
            if(isLeftChild)
                parent.setLeftNode(current.getLeftNode());
            else
                parent.setRightNode(current.getLeftNode());
        }
        // right children
        else if(current.getLeftNode() == null) {
            if(current == root)
                root = current.getRightNode();
            if(isLeftChild)
                parent.setLeftNode(current.getRightNode());
            else
                parent.setRightNode(current.getRightNode());
        }
        // two children
        else {
            Node successor = getSuccessor(current);

            if(current == root) {
                root = successor;
            } else if(isLeftChild) {
                parent.setLeftNode(successor);
            } else
                parent.setRightNode(successor);

            successor.setLeftNode(current.getLeftNode());
        }

        return true;
    }

    public Node getSuccessor(Node delNode) {
        Node current = delNode.getRightNode();
        Node successor = delNode;
        Node parentNode = delNode;

        while(current != null) {
            parentNode = current;
            successor = current;
            current = current.getLeftNode();
        }

        if(successor != delNode.getRightNode()) {
            parentNode.setLeftNode(successor.getRightNode());
            successor.setRightNode(delNode.getRightNode());
        }
        return successor;
    }


    public void traverseTree() {
        inOrder(root);
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeftNode());
            System.out.println(root);
            inOrder(root.getRightNode());
        }
    }

    public void displayTree()
    {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(
                ".....................................................");
        while(isRowEmpty==false)
        {Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++)
                System.out.print(" ");
            while(globalStack.isEmpty()==false)
            {
                Node temp = (Node)globalStack.pop();
                if(temp != null)
                {
                    System.out.print(temp.getData());
                    localStack.push(temp.getLeftNode());
                    localStack.push(temp.getRightNode());
                    if(temp.getLeftNode() != null ||
                            temp.getRightNode() != null)
                        isRowEmpty = false;
                }
                else
                {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j<nBlanks*2-2; j++)
                    System.out.print(" ");
            } // end while globalStack not empty
            System.out.println();
            nBlanks /= 2;
            while(localStack.isEmpty()==false)
                globalStack.push( localStack.pop() );
        } // end while isRowEmpty is false
        System.out.println(
                ".....................................................");
    } // end displayTree()

    public Node lca(Node a, Node b) {
        Node root = this.root;

        while (root != null) {
            if(root.getData() < a.getData() && root.getData() < b.getData()) {
                root = root.getRightNode();
            } else if(root.getData() > a.getData() && root.getData() > b.getData()) {
                root = root.getLeftNode();
            } else break;
        }
        return  root;
    }

}
