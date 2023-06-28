import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Longest_Subarray_Zero_Sum {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		
		int len= 0;
		int currentSum =0;
		HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, -1); 

		for (int i = 0; i < arr.size(); i++) {
			 currentSum += arr.get(i);

            if (sumMap.containsKey(currentSum)) {
                int length = i - sumMap.get(currentSum);
                len = Math.max(len, length);
            } else {
                sumMap.put(currentSum, i);
            }
		}

		return len;

	}
}