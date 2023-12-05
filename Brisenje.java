import java.util.Arrays;

public class Main {
    public static void add(int arr[], int n, int k) {
        int newarr[] = new int[n];
        int i;

        for (i = 1; i < k + 1; i++) {
            newarr[i] = arr[i - 1];
            
        }
      
        
        for (i = k + 1; i < n; i++) {
            
            newarr[i] = arr[i];
        }

        
        for(i = 0; i < newarr.length - 1; i++) {
            newarr[i] = newarr[i + 1];
        }
        
        newarr = Arrays.copyOf(newarr, newarr.length - 1);
        

        System.out.println(Arrays.toString(newarr));
    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 5;
        System.out.println(Arrays.toString(arr));

        add(arr, n, k);
    }
}
