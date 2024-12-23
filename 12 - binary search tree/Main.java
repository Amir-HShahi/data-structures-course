public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        tree.add(2);
        tree.add(1);
        tree.add(5);
        tree.add(6);
        tree.add(3);
        
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(50);
        // list.add(20);
        // list.add(19);
        // list.add(21);
        // list.add(49);
        // list.add(51);
        // list.add(30);

        // tree.toAVLTree(list);

        // System.out.println(tree.getMaxDepth());
        System.out.println(tree.contains(0));

    }
}
