import java.util.*;
public class whileExample{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
    
        //while loop
        int i=0;
        while(i<10){
            System.out.println("Hello world");
            i++;
        }

        //get number from user
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        int j=1;
        while(j<=n){
            System.out.print(j+" ");
            j++;
        }
        System.out.println();

        //sum of numbers
        System.out.println("Enter any no :");
        int p=sc.nextInt();
        int k=1;
        int sum = 0;
        while(k<=p){
           sum=k+sum;
           k++; 
        }
        System.out.println(sum);

        //for loop
        for(int line=1;line<5;line++){
            System.out.println("*****");
        }

        // reverse the a number
        int y = 10899;
        while(y>0){
            int lastDigit = y%10;
            System.out.println(lastDigit);
            y = y/10;
        }
        System.out.println();

        //reverse of no
        int z=23765;
        int rev = 0;
        while(z>0){
            int lastDigits = z%10;
            rev=(rev*10)+lastDigits;
            z= z/10;
        }
         System.out.println(rev);

        //keep entering numbers till user enter multiple of 10
        System.out.println("keep entering numbers till user enter multiple of 10");
        do{
            System.out.println("Enter a number:");
            int s =sc.nextInt();
            if(s%10==0){
                break;
            }
            System.out.println(s);
               
        }while(true);

        //Display all numbers entered by usera except multiple of 10
        System.out.println("Display all numbers entered by usera except multiple of 10");
        do{
            System.out.println("Enter a no:");
            int R =sc.nextInt();
            if(R%10==0){
                continue;
            }
          System.out.println(R);
        }while(true);

    }
}