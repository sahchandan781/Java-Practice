package Day3OOPS;

// static keyword make the variable class dependend not object dependent

public class ConceptOfStatic {
    public static void main(String[] args) {
        class Student{
            String name;
            int rollno;
            double percent;

            static int numberofStu;

            //first constructor
            Student(String naam, int rolln, double per){
                name = naam;
                rollno = rolln;
                percent = per;
                numberofStu++;
            }
        }

        Student s1 = new Student("chandan", 78, 74.5);
        System.out.println(s1.numberofStu);

        Student s2 = new Student("chandan", 78, 74.5);
        System.out.println(s1.numberofStu);

        Student s3 = new Student("chandan", 78, 74.5);
        System.out.println(s3.numberofStu);

        //let if we want to call for s1 s2 and s3 the it will give the same answer
        System.out.println(s1.numberofStu);
        System.out.println(s2.numberofStu);
        System.out.println(s3.numberofStu);
    }
}
