package Day3OOPS;

public class PassingClasstoFunction {

    public static class Student {
        String name;
        int rollno;
        double percent;
    }
    public static void fun(Student x){
        System.out.println(x.name);
        System.out.println(x.rollno);
        System.out.println(x.percent);
    }

    public static void change(Student s){
        s.name = "rohan";
        
    }
    public static void main(String[] args) {
    
        Student s1 = new Student();
        s1.name = "chandan";
        s1.percent = 74.5;
        s1.rollno = 78;
        fun(s1);

        Student s2 = new Student();
        s2.name = "Abhishek";
        s2.percent = 70;
        s2.rollno = 80;

        fun(s2);

        s2.name = "romeo";
        System.out.println(s2.name);

        change(s2);
        System.out.println(s2.name);

        
    }
}
