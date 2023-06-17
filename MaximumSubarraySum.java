import java.util.* ;
import java.io.*; 

public class MaximumSubarraySum {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long max=(long)arr[0];
		long sum = 0;
        for(int i=0; i<n ; i++){
            sum += (long)arr[i];
            if(sum > max ){
                max = sum;
            }
            if(sum<0){sum = 0;}
        }
		if(max>0)
  			return max;
		return 0;
	}

}
