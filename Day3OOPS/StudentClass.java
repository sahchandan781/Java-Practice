package Day3OOPS;


    public  class StudentClass {


        // user defined data type
        public static class student {
            String name;
            int rollno;
            double percent;
        }
        public static void main(String[] args) {
            // declaration of an object 
            // object are real life intity
            student x = new student();
            x.name  = "chandan";
            x.rollno = 78;
            x.percent = 75;
    
            System.out.println(x.name);
    
             
        }
    }

