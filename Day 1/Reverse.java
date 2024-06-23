// input number 123 ---> 321

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        // it will only perform for positive number 
        while(n>0)
        {
            int rem = n % 10;
            System.out.print(rem);
            n /= 10;
        }

    }
}
