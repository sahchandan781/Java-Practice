import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string or character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        if(ch =='a' || 
        ch == 'e' || 
        ch == 'i' || 
        ch == 'o' ||
        ch == 'u' || 
        ch == 'e' ||
        ch == 'A'||
        ch == 'E' || 
        ch == 'I' || 
        ch == 'O' ||
        ch == 'U' 
        ){
            System.out.println("Vowel");
        }else
        {
            System.out.println("Consonent");
        }
    }
}
