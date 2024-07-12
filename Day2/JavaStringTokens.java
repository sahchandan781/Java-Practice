package Day2;

//https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        s = s.trim();
        String token[] = s.split("[^A-Za-z]+");

        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            System.out.println(token.length);
        }
        for (String word:token){
            System.out.println(word);
        }
    }
}
