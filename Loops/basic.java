import java.util.*;
public class basic{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any three no :");
        int a = sc.nextInt();
        int b = sc.nextInt();
         int sum = a+b;
        int product = a*b;

        System.out.println("Enter radious :");
        float rad = sc.nextFloat();
        float Area= 3.14f*rad*rad;

        System.out.println("Enter any three floting no :");
        float pen =sc.nextFloat();
        float pencil =sc.nextFloat();
        float eraser =sc.nextFloat();
        float Avg = (pen+pencil+eraser)/3;
        //Add gst of 18%
        float newtotal = Avg + (0.18f * Avg);

        System.out.println("sum of no is : "+ sum);
        System.out.println("product of no is : "+ product);
        System.out.println("Area of no is : "+ Area);
        System.out.println("Avg of three products are :"+ Avg);
        System.out.println("Bill with 18% gst :"+ newtotal);

       
    }
}