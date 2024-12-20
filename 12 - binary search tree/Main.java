import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(3);

        tree.toAVLTree(list);

        System.out.println(tree);
    }
}
