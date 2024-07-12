package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if( a.length() != b.length()){
            return false;
        }
        char arrA[] = a.toCharArray();
        char arrB[] = b.toCharArray();
        
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        
        for( int i = 0; i<=a.length(); i ++){
            if(arrA[i] != arrB[i]){
                return false;
            }
        }
        
        return true;
        
        
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
