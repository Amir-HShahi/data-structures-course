public class Sort {
    public static int[] merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while ((i + j) < c.length) {
            if ((j >= m) || ((i < n) && (a[i] <= b[j]))) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        return c;
    }
}
