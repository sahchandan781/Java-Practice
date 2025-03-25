package PracticeDsa;

public class ConsecutiveZeroOne {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        maxOnes(arr);
        maxZeros(arr);


        
    }

    public static void maxOnes(int[] arr){
        int max_ones = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
                max_ones = Math.max(max_ones, count);
                
            } else {
                count = 0;
                

            }
        }

        System.out.println(max_ones);
    }

    public static void maxZeros(int[] arr){
        int max_Zeros = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count++;
                max_Zeros = Math.max(max_Zeros, count);
                
            } else {
                count = 0;
                

            }
        }

        System.out.println(max_Zeros);
    }
}

