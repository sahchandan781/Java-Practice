import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        int n, rem, counter= 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        n = sc.nextInt();
        sc.close();

        while(n>0){
            rem = n % 10;
            counter++;
            n= n/10;
        }
        System.out.println(counter);
    }
}
