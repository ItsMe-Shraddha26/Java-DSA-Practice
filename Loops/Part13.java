import java.util.*;

public class Part13{

    public static void update(int marks[],int nonchangable){
        int nonChangable =5;
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }

    //
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        //Array
        int numbers[] = new int [50];
        System.out.println("Length of an array :"+numbers.length);

        //input
        System.out.println("Enter any three numbers : ");
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        
        //update
        numbers[1] = numbers[1]+1;
        numbers[2] =50;

        //output
        System.out.println("phy :"+numbers[0]);
        System.out.println("math :"+numbers[1]);
        System.out.println("chem :"+numbers[2]);

       //By Refferal
       
        int marks[]= {10,11,12};
        int nonchangable = 10;
        update(marks,nonchangable );
        System.out.println(nonchangable);

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
           
        }
        System.out.println();
    }
}