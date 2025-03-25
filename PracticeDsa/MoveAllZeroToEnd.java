package PracticeDsa;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int n = arr.length;
        int temp[] = new int[n];
        int count = 0;


        for(int i =0; i<arr.length; i++) {
            if(arr[i] >0){
                temp[count] = arr[i];
                count++;
            }
        }

        while(count< n){
            temp[count] = 0;
            count++;
        }

        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }

        for(int num:arr) {
            System.out.print(num +" ");
        }

    }
}
