import java.util.*;
public class Part_11{
    //Functions/Methods
    public static void HelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    //parametarized function
    public static int PrintSum(int num1,int num2) //parameter or formal parameters
    {
        int sum= num1+num2;
        return sum;
    }
    //Swaping function
    public static void SwapFunc(int a,int b){
        System.out.println("swap of no within function :");
        int temp = a;
             a = b;
             b = temp;
        System.out.println("a ="+a);
        System.out.println("b ="+b);
    }

    //product function
    public static int Product(int a,int b){
        int product = a*b;
        return product;
    }
    
    //prime number
    public static boolean isPrime(int p){
        if(p<=1){
            return false;
        }
        for(int i=2;i<=p-1;i++){
          if(p%2==0){
            return false;
          }
        }
        return true;  
    }
    //Factorial function
    public static int factorial(int f){
        int fact = 1;
        for(int i =1; i<=f; i++){
            fact=fact*i;
        }
        return fact;
    }
    //Bionomial function
    public static int BinCoeff(int n,int r){
        int fact_n= factorial(n);
        int fact_r= factorial(r);
        int fact_nmr= factorial(n-r);

        int Coeff = fact_n/ (fact_r * fact_nmr);
        return Coeff;
    }

/***************************************************** **********/

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        HelloWorld();//calling the function
        System.out.println("Enter a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = PrintSum(a,b); //arguments or actual parameters
        System.out.println("sum of a and b is :"+sum);

        //swapping of two numbers
        SwapFunc(a,b);
        System.out.println("swap of no outside the function :");
        System.out.println("a ="+a);
        System.out.println("b ="+b);

        //Product of a and b
        int product = Product(5,2);
        System.out.println("product of 5 and 2 is :"+product);

        //NO is prime or not
        System.out.println("Enter the no is prime or not :");
        int p = sc.nextInt();
        if(isPrime(p)){
          System.out.println("No is prime");
        }else{
            System.out.println("No is not prime");
        }

        //Factorial of c
        System.out.println("Enter value of n and r for binCoeff:");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int Factorial = BinCoeff(n,r);//calling binomial fun
        System.out.println("binCoeff of n and r is :"+Factorial);

    }
}