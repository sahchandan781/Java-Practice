import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to chech whether it is leap or not: ");
        y = sc.nextInt();
        sc.close();

        if( y% 100 ==0 && y%400 == 0 || y%100 !=0 && y%4 == 0){
            System.out.println("Leap Year");
        }else {
            System.out.println("It is not a leap year");
        }
    }
}
