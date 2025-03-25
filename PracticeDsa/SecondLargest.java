package PracticeDsa;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,5,6,7,8};
        int largest = 0,seclar = 0;

        for(int  i = 0; i< arr.length; i++) {
            if(arr[i] > largest){
                seclar = largest;
                largest = arr[i];

            } else if(arr[i]< largest && arr[i] > seclar) {
                seclar = arr[i];
            }
        }

        System.out.println(seclar);

    }
}
