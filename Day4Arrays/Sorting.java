package Day4Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 9, 4, 5, 8,2,4, 88, -1};

        for( int i = 0; i< arr.length; i++){

            for( int j = i+1; j<arr.length; j++){
                int temp = 0;

                if(arr[j] < arr[i]){

                    // Swaping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.print(arr[i] + " ");
        }
    }
}
