package Day3OOPS;

public class ClassesInsideMain {
    
    public static void main(String[] args) {

        // user defined data type
     class student {
        String name;
        int rollno;
        double percent;
    }

        // declaration of an object 
        // object are real life intity
        student x = new student();
        x.name  = "chandan";
        x.rollno = 78;
        x.percent = 75;

        System.out.println(x.name);
        System.out.println(x.percent);
        System.out.println(x.rollno);

         
    }
}
