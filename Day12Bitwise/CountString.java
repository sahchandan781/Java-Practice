package Day12Bitwise;

public class CountString {
    public static void main(String[] args) {
        String x = "Chandan kumar sah";
        int count = 0;
        System.out.println(x.length());

        for(int i = 0; i < x.length(); i++){
            count++;
        }
        System.out.println(count);
    }
}
