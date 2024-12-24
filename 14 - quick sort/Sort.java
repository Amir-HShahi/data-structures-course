import java.util.List;

public class Sort {
    public static void quick(List<Integer> list) {
        quickSortHandler(list, 0, list.size() - 1);
    }

    private static void quickSortHandler(List<Integer> list, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(list, start, end);
            quickSortHandler(list, pivotIndex + 1, end);
            quickSortHandler(list, start, pivotIndex - 1);
        }
    }

    private static Integer partition(List<Integer> list, int start, int end) {
        Integer pivot = list.get(start);
        int i = start + 1;
        int j = end;
        while (i <= j) {
            if (pivot.compareTo(list.get(i)) < 0) {
                while (pivot.compareTo(list.get(j)) < 0) {
                    j--;
                }
                swap(list, i, j);
            }
            i++;
        }
        swap(list, start, i - 1);
        return i - 1;   
    }

    private static void swap(List<Integer> list, int first, int second) {
        Integer temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}