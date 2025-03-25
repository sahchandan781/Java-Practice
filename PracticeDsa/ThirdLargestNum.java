package PracticeDsa;

public class ThirdLargestNum {
    public static void main(String[] args) {
        int[] arr = {7,2,9,4,8,6};

        int largest = 0, seclar = 0, thiLar = 0;


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
        System.out.println(thiLar);
    } 
}
