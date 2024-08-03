package Day11Recursion;

public class BinarySearch {
    // binary search using recursion

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 0;
        System.out.println(binary(arr, target, 0, arr.length -1));
    } 

    static int binary(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e-s) / 2 ;

        if(arr[m] == target){
            return m;
        }

        if(target < arr[m]){
            return binary(arr, target, s, m - 1);
        }

        return binary(arr, target, m +1, e);

    }
}
