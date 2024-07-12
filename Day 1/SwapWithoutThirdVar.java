// In this program we will try to swap the value of to
// different variable without using any temporary variable

public class SwapWithoutThirdVar {
    public static void main(String[] args) {
        int a=10, b= 12;

        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("value of a is "+ a + " And Value of b is "+ b);
    }
}
