import java.util.List;

public class Sort {
    static int j = 0;
    public static <T extends Comparable<T>> void insertion(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            int index = getInsertionIndex(0, i, list.get(i), list);
            for (int j = i; j > index; j--) {
                list.set(i, list.get(i - 1));
            }
            list.set(index, list.get(index));
        }
    }

    private static <T extends Comparable<T>> int getInsertionIndex(int start, int end, T key, List<T> list) {
        j++;
        if (j > 10) {
            return -100;
        }

        int insertionIndex;
        if (start > end) {
            insertionIndex = start;
        }
        int mid = (start + end) / 2;
        if (key.compareTo(list.get(mid)) < 0) {
            insertionIndex = getInsertionIndex(start, mid - 1, key, list);
        } else {
            insertionIndex = getInsertionIndex(mid + 1, end, key, list);
        }
        return insertionIndex;
    }
}
