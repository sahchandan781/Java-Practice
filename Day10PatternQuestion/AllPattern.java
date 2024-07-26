package Day10PatternQuestion;

public class AllPattern {
    public static void main(String[] args) {
        System.out.println("first question");
        pattern1(5);
        System.out.println("second question");
        pattern2(5);
        System.out.println("third question");
        pattern3(5);
        System.out.println("fourth question");
        pattern4(5);
        System.out.println("fifth question");
        pattern5(5);

        System.out.println("seventeen question");
        pattern17(5);
        System.out.println("twenty eighth question");
        pattern28(5);
        System.out.println("thirty question");
        pattern30(5);


    }
    

    public static void pattern1(int n){
        for(int  row = 1; row <= n; row++){
            for(int col = 1; col <=  n ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int  row = 1; row <= n; row++){
            for(int col = 1; col <=  row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void pattern3(int n){
        for(int  row = 1; row <= n; row++){
            for(int col = 1; col <=  n-row+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int  row = 1; row <= n; row++){
            for(int col = 1; col <=  row ; col++){
                System.out.print(col+" " );
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int  row = 1; row < 2*n-1; row++){
            int totalcolumnsInRow = row > n ? 2*n - row: row;
            for(int col = 1; col <  totalcolumnsInRow ; col++){
                System.out.print("*");
                 
            }
            System.out.println();

        }
    }

    public static void pattern17(int n){
        for(int row= 1; row <= 2*n-1; row++){
            int c = row > n ? 2*n-row: row;
            for(int space = 0; space < n- c ; space++){
                System.out.print(" ");
            }
            for(int col = c; col>= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= c; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern28(int n){
        for(int  row = 0; row < 2*n; row++){
            int totalcolumnsInRow = row > n ? 2*n - row: row;
            int noOfSpace = n - totalcolumnsInRow;
            for(int s = 0; s< noOfSpace; s++){
                System.out.print(" ");
            }
            for(int col = 0; col <  totalcolumnsInRow ; col++){
                System.out.print("* ");
                 
            }
            System.out.println();

        } 
    }

    public static void pattern30(int n){
        for(int row= 1; row < n; row++){
            for(int space = 0; space < n- row ; space++){
                System.out.print(" ");
            }
            for(int col = row; col>= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    
}
