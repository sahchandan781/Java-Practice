//    calculate the power  of a number 
// input n =5;
//power p = 2;
//ans = 25

import java.util.Scanner;

/**
 * PowerOfANumber
 */
public class PowerOfANumber {

    public static void main(String[] args) {
        int n , p, result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n= sc.nextInt();
        System.out.print("Enter power: ");
        p = sc.nextInt();
        sc.close();

        for(int i = 1; i<=p; i++){
            result = n * result;
        }
        System.out.println(result);
    }
}

