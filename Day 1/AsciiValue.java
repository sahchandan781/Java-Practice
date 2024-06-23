import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        
        System.out.print("Enter the Character: ");
        Scanner sc  = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();

        int a = ch;
        System.out.println("ASCII value of "+ch +" is "+a);
    }
}
