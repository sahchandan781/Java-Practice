package Day13Array;

import java.util.*;

public class FindDuplicate {
    public List<Integer> findDuplicates(int[] nums){
        int n = nums.length;

        int[] arr = new int[n];

        List<Integer> list  = new ArrayList<>();

        for (int  i : nums) {
            if (++arr[i] > 1){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FindDuplicate solution = new FindDuplicate();

        int[] nums = {4, 3, 2, 7, 7, 2, 3, 1};
        List<Integer> duplicates = solution.findDuplicates(nums);
        System.out.println("Duplicate elements are: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
