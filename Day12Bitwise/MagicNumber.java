package Day12Bitwise;

// 1 = 001 = 5
// 2 = 010 = 25
// 3 = 011 = 30
// 4 = 100 = 125
// 5 = 101 = 130
// 6 = 110 = 150 and so on

public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;

        int ans = 0;
        int base  = 5;

        while( n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}
