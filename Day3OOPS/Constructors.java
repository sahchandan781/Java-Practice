package Day3OOPS;

public class Constructors {
    public static void main(String[] args) {
         class Student{
            String name;
            int rollno;
            double percent;

            //default constructor
            Student(){}

            //first constructor
            Student(String naam, int rolln, double per){
                name = naam;
                rollno = rolln;
                percent = per;
            }
            //second constructor
            Student( int rolln, double per){
                
                rollno = rolln;
                percent = per;
            }
            //third constructor
            //we cant use all the argument in this constructor
            //becoz we have already used in first constructor
            //we have used this keyword becoz the variable name in constructor and class is same
            // this will create difficulty so we used this key word to understand that 
            Student(String name,  double percent){
                this.name = name;
                this.percent = percent;
            }    
        }
        
        // this will work according to first constructor
        Student s1 = new Student("chandan", 78, 74.5);
        System.out.println(s1.name + " " + s1.percent + " " + s1.rollno);

        // this will run according to second constructor
        Student s2 = new Student(78, 39);
        System.out.println(s2.name + " " + s2.rollno);

        // this will work on the basis of default constructor
        Student s3 = new Student();
        s3.name = "raghav";
        s3.rollno = 72;
        s3.percent = 4;
        System.out.println(s3.name +" "+ s3.rollno +" "+ s3.percent);
        
        //this will word on the basis of 3rd constructor
        Student s4 = new Student("rahul", 76);
        System.out.println(s4.name+ " " + s4.percent);


    }
}
