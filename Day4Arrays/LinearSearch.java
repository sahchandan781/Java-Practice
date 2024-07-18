package Day4Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4 , 2, 3, 5, 4, 3,7, 6, 20};
        int target = 20;
        int ans = -1;

        for (int i=0; i<arr.length; i++){
            if(arr[i]==target){
               ans = i;
               break;
            }
            
        }
        if(ans == -1){
            System.out.println("not found");
        }else{
            System.out.println("Found at "+ target +" at index "+ans);
        }
        
    }
}
