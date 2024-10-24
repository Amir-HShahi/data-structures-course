public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,6};
        int[] b = {3,4,5};
        for (int i : Merge.merge(b, a)) {
            System.out.println(i);
        }
    }
}