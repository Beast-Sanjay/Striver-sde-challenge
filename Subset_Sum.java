import java.util.* ;
import java.io.*; 
public class Subset_Sum {
     public static ArrayList<Integer> subsetSum(int[] nums) {
        ArrayList<Integer> subsetSums = new ArrayList<>();
        subsetSums.add(0); // Adding 0 as an initial subset sum

        // Recursive helper function to generate subset sums
        generateSubsetSums(nums, 0, 0, subsetSums);

        // Sort the subset sums in non-decreasing order
        Collections.sort(subsetSums);

        return subsetSums;
    }

    private static void generateSubsetSums(int[] nums, int index, int currentSum, ArrayList<Integer> subsetSums) {
        if (index == nums.length) {
            return;
        }

        // Include the current number in the sum
        int newSum = currentSum + nums[index];
        subsetSums.add(newSum);

        // Recursively generate subset sums including and excluding the current number
        generateSubsetSums(nums, index + 1, newSum, subsetSums);
        generateSubsetSums(nums, index + 1, currentSum, subsetSums);
    }

}