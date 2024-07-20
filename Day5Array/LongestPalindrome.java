package Day5Array;

public class LongestPalindrome {
    public static void main(String[] args) {

        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
        
    }

    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        for(char ch:s.toCharArray())
            count[ch]++;
        int res = 0;

        for(int i = 0; i<128; i++){
            int val = count[i];
            res = res + (val/2)*2;
            if(res%2==0 && val%2==1)
               res++;

        }
        return res;
    }
}
