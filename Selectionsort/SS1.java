package Selectionsort;

// select a element and put it on the rigth position

import java.util.*;

public class SS1 {

    public static void selection(int[] s){
        for(int i = 0; i<s.length; i++){
            int last = s.length - i- 1;
            int maxIndex = getMaxIndex(s, 0, last);
            swap(s, maxIndex, last);
            
        }
    }

    public static int getMaxIndex(int[] s,int start, int end) {
        int max = start;
        for(int i = start; i<= end; i++){
            if (s[max] < s[i]){
                max = i;
            }
        }

        return max;
    }

    public static void swap(int[] s, int first, int second){
        int temp = s[first];
        s[first] = s[second];
        s[second] = temp;
    }

    public static void main(String[] args) {
        int[] s = {4,5,1,2,3};

        selection(s);
        System.out.println(Arrays.toString(s));

        
    }
}
