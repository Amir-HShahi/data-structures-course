import java.util.HashMap;

public class AdjMatrix {
    int[][] matrix = new int[5][5];

    HashMap<Integer, Integer> countInEdges() {
        HashMap<Integer, Integer> foo = new HashMap<Integer, Integer>();
        foo.put(1, 0);
        foo.put(2, 0);
        foo.put(3, 0);
        foo.put(4, 0);
        foo.put(5, 0);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    foo.replace(j + 1, foo.get(j + 1) + 1);
                }
            }
        }
        return foo;
    }
}
