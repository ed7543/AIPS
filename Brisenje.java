import java.util.Arrays;

public class Main {
    public static void add(int arr[], int n, int k) {
       for(int i = k; i < n - 1; i++) {
           arr[i] = arr[i + 1];
       }
       
       arr = Arrays.copyOf(arr, n - 1);
       System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 5;
        System.out.println(Arrays.toString(arr));

        add(arr, n, k);
    }
}
