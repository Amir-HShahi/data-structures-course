import java.util.List;

public class Sort {
    public static <T extends Comparable<T>> void insertion(List<T> list) {
        // sort any comparable object
        for (int i = 1; i < list.size(); i++) {
            T key = list.get(i);
            int flagIndex = i - 1;
            while ((flagIndex >= 0) && (list.get(flagIndex).compareTo(key) > 0)) {
                list.set(flagIndex + 1, list.get(flagIndex));
                flagIndex--;
            }
            list.set(++flagIndex, key);
        }
    }
}
