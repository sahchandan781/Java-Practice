import java.util.Scanner;

public class SumOfEvenNumberInARange {
    public static void main(String[] args) {
        int n, j =0;
        System.out.print("Enter a Upper value of a Range: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        for(int i = 0; i<=n; i= i+2){
            j = j + i;
           
        }
        System.out.println(j);
    }
}
