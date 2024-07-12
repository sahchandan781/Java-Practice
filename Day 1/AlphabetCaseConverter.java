// in this program wee will convert the uppercse word to lowercase and
// viceversa

import java.util.Scanner;

public class AlphabetCaseConverter {
    public static void main(String[] args) {
        String ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence or word or letter");
        ch = sc.next();
        sc.close();

        if( ch.charAt(0) >= 'A' && ch.charAt(0) <= 'Z'){
            System.out.println(ch.toLowerCase());
        } else {
            System.out.println(ch.toUpperCase());
        }
    }
}
