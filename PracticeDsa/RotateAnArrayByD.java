package PracticeDsa;

public class RotateAnArrayByD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;
        int n = arr.length;
        

        while(d>0){
            for(int i = 0; i<n-1; i++){
                int left = i;
                int right = i+1;
                
    
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
            }
            d--;
        }

        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
