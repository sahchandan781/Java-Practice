package Day5Array;

public class SquaresofSortedArr {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        int[] result = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }

        int head = 0;
        int tail = nums.length-1;

        for(int pos = nums.length-1; pos>=0; pos--){
            if(nums[head] > nums[tail]){
                result[pos] = nums[head];

                //increament the head
                head++;
            }
            else{
                result[pos] = nums[tail];

                tail--;
            }

            
        }

        for(int i = 0; i<nums.length; i++){
            System.out.print(result[i]+ " ");
        }
        
    }
}
