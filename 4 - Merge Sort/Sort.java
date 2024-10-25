import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static <T extends Comparable<T>> void mergeSort(List<T> list, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(list, start, mid);
            mergeSort(list, mid + 1, end);
            merge(list, start, end, mid);
        }
    }

    private static <T extends Comparable<T>> void merge(List<T> list, int start, int end, int mid) {
        ArrayList<T> leftList = new ArrayList<T>();
        for (int i = start; i <= mid; i++) {
            leftList.add(list.get(i));
        }
        ArrayList<T> rightList = new ArrayList<T>();
        for (int i = mid + 1; i <= end; i++) {
            rightList.add(list.get(i));
        }
        int k = start;
        int i = 0;
        int j = 0;
        while ((i + j) < (end - start + 1)) {
            if ((j >= rightList.size())
                    || ((i < leftList.size()) && (leftList.get(i).compareTo(rightList.get(j)) < 0))) {
                list.set(k, leftList.get(i));
                i++;
            } else {
                list.set(k, rightList.get(j));
                j++;
            }
            k++;
        }
    }
}
