package Day13Array;


// Java Program for Maximum Subarray Sum using Kadane's Algorithm

public class LargestSumOfSubArrays {

 // Function to find the maximum subarray sum
    public static int maxSubarraySum(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];

        // Find the maximum sum ending at index i by either extending 
        // the maximum sum subarray ending at index i - 1 or by
        // starting a new subarray from index i
        for (int i = 0; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            // Update res if maximum subarray sum ending at index i > res
            res = Math.max(res,maxEnding);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}
