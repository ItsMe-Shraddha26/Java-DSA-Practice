import java.util.*;
public class Part_9{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        
         //Check no is prime or not

        System.out.println("Check no is prime or not");
        System.out.println("Enter a no :");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Numbers less than or equal to 1 are not prime.");
        }else if(n==2){
            System.out.println("2 is always prime");
        }else{
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n%i==0){          //n is a multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }
            if(isPrime==true){
               System.out.println("Given no is prime no");
            }else{
                System.out.println("Given no is not prime");
            }

        }

//Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("Enter the number ");
            number=sc.nextInt();
            if(number%2==0) {
                evenSum+=number;
            }else{
                    oddSum+=number;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0f or no");
                    choice=sc.nextInt();
        }while(choice==1);
                   
            System.out.println("Sum of even numbers: "+evenSum);
            System.out.println("Sum of odd numbers: "+oddSum);
            
   //OR

    System.out.println("Enter the count of no you want to add:");
    int N = sc.nextInt();
    
       while(N>0){
        
        int currentNo = sc.nextInt();

        if(currentNo %2==0){
            evenSum+=currentNo;
        }else{
            oddSum+=currentNo;
        }
         N--;
      }     
        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);

//factorial of any number
        System.out.println("Enter a no to find factorial :");
        int a= sc.nextInt();
        int fact = 1;

        for(int i=1;i<=a;i++){
           fact=fact*i;
        }
        System.out.println(fact);

//Table of any number
        System.out.println("Enter a no for any number :");
        int b = sc.nextInt();
        for(int i=1;i<=10;i++){
           System.out.println(b+"x"+i+"="+i*b);
        }
    
    }
}