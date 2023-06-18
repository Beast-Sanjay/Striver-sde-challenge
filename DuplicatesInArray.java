import java.io.*;
import java.util.* ;

public class DuplicatesInArray{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            } else {
                seen.add(num);
            }
        }
        return 0;
    }
}
