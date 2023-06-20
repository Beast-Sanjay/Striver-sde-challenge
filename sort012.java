// this code uses dutch national flag algorithm
import java.util.* ;
import java.io.*; 
public class sort012 
{public static void sort012(int[] arr) {
    int low = 0;        // Pointer for 0s
    int mid = 0;        // Pointer for 1s
    int high = arr.length - 1;   // Pointer for 2s

    while (mid <= high) {
        switch (arr[mid]) {
            case 0:
                swap(arr, low, mid);
                low++;
                mid++;
                break;
            case 1:
                mid++;
                break;
            case 2:
                swap(arr, mid, high);
                high--;
                break;
        }
    }
}

private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}
