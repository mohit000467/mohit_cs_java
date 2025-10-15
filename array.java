import java.util.*;

public class array {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            // Integer a = in.nextInt();
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
