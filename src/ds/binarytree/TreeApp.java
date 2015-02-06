package ds.binarytree;

/**
 * Created by Jainik on 1/29/2015.
 */
public class TreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(15);
        tree.insert(12);
        tree.insert(30);
        tree.insert(9);
        tree.insert(2);

        //System.out.println(tree.find(30));
        //tree.traverseTree();
        tree.displayTree();
        System.out.println(tree.lca(new Node(7),new Node(30)));
    }
}
