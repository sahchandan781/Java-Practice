package Day4Arrays;

public class FrequencyOfEle {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 3, 5, 5, 7, 1};
        int target = 1;
        int count = 0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
