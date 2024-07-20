package Day4Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] nums = {0,1,2,3,5};
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        int n = nums.length;
        int actualsum = n*(n+1)/2;

        System.out.println(actualsum - sum);
    }

    
}
