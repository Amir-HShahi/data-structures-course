import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        Sort.mergeSort(list, 0, list.size() - 1);
        System.out.println(list);
    }
    
}