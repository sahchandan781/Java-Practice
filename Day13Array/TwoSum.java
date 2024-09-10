package Day13Array;

// Two pointer aproach to solve two sum problem

// If the sum equals the target, we’ve found the pair.
// If the sum is less than the target, move the left pointer to the right to increase the sum.
// If the sum is greater than the target, move the right pointer to the left to decrease the sum.

import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;

        // Call the twoSum function and print the result
        System.out.println(twoSum(arr, target));
    }



    static boolean twoSum(int[] arr, int target) {
       
        Arrays.sort(arr);
        int left = 0, rigth = arr.length -1;

        while( left < rigth ){
            int sum = arr[left] + arr[rigth];

            if(sum == target){
                return true;
            }
            else if(sum < target){
                left++;
            }
            else {
                rigth--;
            }
        }
          
        return false;
      
    }
}
