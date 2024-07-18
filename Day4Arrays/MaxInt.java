package Day4Arrays;

public class MaxInt {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = {1 , 3, 4, 5, 9, 2, 0};

        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
