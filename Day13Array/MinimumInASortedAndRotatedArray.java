package Day13Array;
import java.util.*;

public class MinimumInASortedAndRotatedArray {

    public static int findMin(List<Integer> arr) {
        int res = arr.get(0);

        for (int i = 0; i < arr.size(); i++){
            res = Math.min(res, arr.get(i));
        }

        return res;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5, 6, 1, 2, 3, 4);
        System.out.println(findMin(arr));

    }
}
