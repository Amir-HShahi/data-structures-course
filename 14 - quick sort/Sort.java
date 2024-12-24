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

    private static void swap(List<Integer> list, int first, int second) {
        Integer temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}