public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---");
        list.reverse();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // list.delete(4);
        // System.out.println("----");
        // list.add(5);
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
    }
}
