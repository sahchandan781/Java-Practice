package Day4Arrays;

/*  toString()  asList()   deepToString() */

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        String a[] = { "Learn", "coding","KeyPoints","Education"};
        System.out.println("toString()" + Arrays.toString(a));

        System.out.println("asList()"  + Arrays.asList(a));

        int arr[][] = {{10,20}, {30,40}};

        System.out.println("deepTOString()" + Arrays.deepToString(arr));
    }
}
