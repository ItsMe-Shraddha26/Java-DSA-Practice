public class Super{
    public static void main(String args[]){
       Student s1 = new Student();
       s1.schoolName = "jvm";
       System.out.println("Percentage : "+s1.returnPercentage(45,67,45));

       Student s2 = new Student();
       System.out.println("s2 => "+s2.schoolName);

       Student s3 = new Student();
       s3.schoolName = "janata";
       System.out.println("s3=> "+s3.schoolName);

        System.out.println("s2 => "+s2.schoolName);

        //super
        Horse H = new Horse();
        System.out.println(H.color);

    }
}
//static keyWord
class Student{

    static int returnPercentage(int math, int chem, int eng){
       return (math+chem+eng)/3;
    }

    String name;
    int roll;

    static String schoolName;  //By suing static if you make any changes in one obj it 
                                //reflects in others also
    void setName(String name){
       this.name = name;
    }

    String getName(){
        return this.name;
    }
}

//Super keyword
class Animal{
    String color;
    Animal(){
      System.out.println("Constructor of Animal class");
    }
}
class Horse extends Animal{

    Horse(){
        super.color = "brown";      //We can access the parents properties
        System.out.println("Constructor of Horse class");
    }
}