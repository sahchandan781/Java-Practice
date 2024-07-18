package Day4Arrays;

public class UniqueElememts {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2};
        System.out.println(uniqueEle(nums));
    }

    public static int uniqueEle(int[] nums){
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(i<nums.length-1 && nums[i] == nums[i+1]){
                continue;
            }
            else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
        
    }

