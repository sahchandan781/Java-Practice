package Day4Arrays;

public class MinInt {
    public static void main(String[] args) {
        int min = 0;
        int[] arr = {1 , 3, 4, 5, 9, 2, 0};

        for(int i = 0; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}

