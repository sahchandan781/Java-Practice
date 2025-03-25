package PracticeDsa;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 5, 6, 20 };
        int largest = Integer.MIN_VALUE, seclar = Integer.MIN_VALUE, thiLar = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] > largest){
                thiLar = seclar;
                seclar= largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > seclar && arr[i] > thiLar){
                thiLar = seclar;
                seclar = arr[i];
            } else if(arr[i] < largest && arr[i] < seclar && arr[i] > thiLar){
                thiLar = arr[i];
            }
        }
        int max_product = largest * seclar * thiLar;
        System.out.println((max_product));
    }
}
