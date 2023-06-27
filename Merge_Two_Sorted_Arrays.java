
import java.io.*;
import java.util.* ;

public class Merge_Two_Sorted_Arrays {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
       int mergedSize = m + n;
        int[] mergedArr = new int[mergedSize];

        // Copy elements from arr1 to mergedArr
        System.arraycopy(arr1, 0, mergedArr, 0, m);

        // Copy elements from arr2 to mergedArr
        System.arraycopy(arr2, 0, mergedArr, m, n);

        // Sort the merged array
        Arrays.sort(mergedArr);

        return mergedArr;
    }
}

