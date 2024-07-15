package Day3OOPS;

// if we use final keyword for any variable in the class
// then we will never be able to change that variable

public class FinalKeyword {
    public static void main(String[] args) {
        class Student{
            String name;
            int rollno;
            double percent;

            final int fee = 18000;

           
        }

        Student s1 = new Student();
        System.out.println(s1.fee);
    }
}
