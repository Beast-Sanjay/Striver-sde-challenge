import java.io.*;
import java.util.* ;

public class pairSum {
    

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> pair = new ArrayList<>();
        Arrays.sort(arr);
     for(int i =0; i<arr.length;i++){
        for(int j = i+1;j<arr.length;j++){
            if(arr[i]+arr[j] == s){
 int[] newPair = {arr[i], arr[j]};
                pair.add(newPair);
            }
        }
        
     }
     return pair;
    }
}

}
