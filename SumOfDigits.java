import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int n,rem, sum = 0;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        while(n>0){
            rem = n % 10;
            sum += rem;
            n = n/ 10;
        }
        System.out.println(sum);
    }
}
