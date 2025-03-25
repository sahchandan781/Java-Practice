package PracticeDsa;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};

        Arrays.sort(arr);
    
        for(int j = 0; j < arr.length-1; j=j+2){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    
    

    for(int num: arr){
        System.out.print(num + " ");
    }
    }


}
