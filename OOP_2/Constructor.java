public class Constructor{
    public static void main(String args[]){
    
       Student s2 = new Student("shraddha");
       System.out.println("parameterized : "+ s2.name);

       Student s1 = new Student();
       s1.name = "Me";
       s1.rollNo = 59;
       s1.password = "abc";
       s1.marks[0] = 100;
       s1.marks[1] = 90;
       s1.marks[2] = 80;
       System.out.println("non-parameterized : "+ s1.name +" "+ s1.rollNo +" "+ s1.password);

       Student s3 = new Student(s1);     //s3 copy of s1
       s3.password = "xyz";
       System.out.println("copy-Constructor : "+s3.name +" "+ s3.rollNo +" "+ s3.password);
       
       s1.marks[2] = 100;     

       for(int i=0; i<3;i++){      
        System.out.print(s1.marks[i]+" ");
       }

       System.out.println("s3=> ");

       for(int i=0; i<3;i++){      
        System.out.print(s3.marks[i]+" ");
       }
       
    }
}

class Student{
    String name;
    int rollNo;
    String password;
    int marks[];

    Student(){             //non-parameterized Constructor
       marks = new int[3];
       System.out.println("Constructor is called ...");
    }

    Student(String name){             //parameterized Constructor
       marks = new int[3];
       this.name = name;
    }

    /*Student(Student s1){
        marks = new int[3];
        this.name = s1.name;          //shallow cpoy Constructor
        this.rollNo = s1.rollNo;
        this.marks = s1.marks;
    }*/

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;          //deep cpoy Constructor
        this.rollNo = s1.rollNo;
        for(int i=0; i<3; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}