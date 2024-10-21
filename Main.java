import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineCount = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        Scanner diffScanner = new Scanner(System.in);
        for (int i = 1; i <= lineCount; i++) {
            int diff = diffScanner.nextInt();
            arrayList.add(diff);
        }

        for (int i = 0; i < lineCount; i++) {
            System.out.println(find(arrayList.get(i)));
        }
        
    }

    static int find(int diff) {
        int count = 0;
        for (int i = 1; i < diff * diff; i++) {
            for (int j = 1; j <= i; j++) {
                int eachDiff = (i * i) - (j * j);
                if (eachDiff  == diff) {
                    count++;
                }
            }
        }
        return count;
    }
}
