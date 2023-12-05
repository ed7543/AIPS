import java.util.Arrays;

public class Main {
    public static void add(int arr[], int n, int x, int k) {
        if (k < 0 || k > n) {
            System.out.println("Invalid index");
            return;
        }

        int newarr[] = new int[n + 1];
        int i;

        for (i = 0; i < k; i++) {
            newarr[i] = arr[i];
        }

        newarr[k] = x;

        for (i = k; i < n; i++) {
            newarr[i + 1] = arr[i];
        }

        n++;

        System.out.println(Arrays.toString(newarr));
    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 50, k = 5;
        System.out.println(Arrays.toString(arr));

        add(arr, n, x, k);
    }
}
