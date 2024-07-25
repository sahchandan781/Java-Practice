package Day9String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Chandan kumar sah";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
