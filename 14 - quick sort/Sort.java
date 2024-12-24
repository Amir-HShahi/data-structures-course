import java.util.List;

public class Sort {
    public static <T extends Comparable<T>> void quick(List<T> list) {
        quickSortHandler(list, 0, list.size() - 1);
    }

    private static <T extends Comparable<T>> void quickSortHandler(List<T> list, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(list, start, end);
            quickSortHandler(list, pivotIndex + 1, end);
            quickSortHandler(list, start, pivotIndex - 1);
        }
    }

    private static <T extends Comparable<T>> Integer partition(List<T> list, int start, int end) {
        T pivot = list.get(start);
        int i = start + 1;
        int j = end;
        while (i <= j) {
            while (i <= j && (list.get(i).compareTo(pivot) <= 0)) {
                i++;
            }
            while (i <= j && (list.get(j).compareTo(pivot) > 0)) {
                j--;
            }
            if (i < j) {
                swap(list, i, j);
            }
        }
        swap(list, start, j);
        return j;   
    }

    private static <T extends Comparable<T>> void swap(List<T> list, int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}