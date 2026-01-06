import java.util.*;

public class Part_11_2{
    //Function overloading using parameters
    public static int sum(int a,int b){
       return a+b;
    }
    public static int sum(int a,int b,int c){
       return a+b+c;
    }
    
    //Function overloading using DdtaType
    public static float sum(float a,float b){
       return a+b;
    }

    //number is prime or not 
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){//n-1
            if(n%2==0){
                return false;
                
            }
        }
        return true;
    }

    //print all primes numbers Range
    public static void isRangePrime(int N) {
    for (int num = 2; num <= N; num++) {
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        }
    }
    }
    //Conversion of binary number to decimal number
    public static void binToDec(int BinNo){
        int myNumber = BinNo;
        int pow=0;
        int Dec=0;

        while(BinNo>0){
            int LastDigit = BinNo % 10;
            Dec = Dec+(LastDigit*(int) Math.pow(2,pow));
            pow++;
            BinNo = BinNo/10;
        }
        System.out.println("Decimal of "+myNumber +" is :"+Dec);
    }

    //Decimal to binary number 
    public static void decToBin(int n){
        int Mynumber=n;
        int pow = 0;
        int binNo = 0;
        while(n>0){
            int rem = n%2;
            binNo =binNo+(rem*(int)Math.pow(10,pow));

            pow++;
            n = n/2;
        }
        System.out.println("Binary of "+Mynumber+" is = "+binNo);
    }

    //Write a Java method to compute the average of three numbers.
    public static int Avg(int a,int b,int c){
        int Average = (a+b+c)/3;
        return Average;
    }

    //Number is even or Odd
    public static boolean isEven(int n){
        boolean isEven = false;
        if(n%2==0){
            isEven= true;
            
        }else{
            isEven= false;
            
        }
        return isEven;
    }
    //check if a number is a palindrome or not
    public static boolean isPalindrome(int number){
        int palindrome =number;
        int reverse = 0;

        while(palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse*10 + remainder;
            palindrome = palindrome/10;

        }
        if(number == reverse){
            return true;
        }
         return false;
    }

/*************************************************************** */
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("sum of 2 and 3 is :"+sum(2,3));
        System.out.println("sum of 2.4 and 3.1 is :"+sum(2.4f,3.1f));
        System.out.println("sum of 2 and 3 and 4 is :"+sum(2,3,4));
    
System.out.println("------------------------------------------");
    //no is prime or not
    System.out.println("Entered  number  is prime or not :");
    if(isPrime(3)){
        System.out.println("Number 3 is prime");
    }else{
        System.out.println("no 3 is not prime");
    }
 System.out.println("------------------------------------------");
    //range f prime numbers
    isRangePrime(10);
 System.out.println("------------------------------------------");
     //Binary to Decimal number conversion
     System.out.println("Eneter any Binary number to convert into Decimal");
     int f = sc.nextInt();
     binToDec(f);
 System.out.println("------------------------------------------");
     // Decimal to Binary number conversion
     System.out.println("Eneter any Decimal number to convert into binary");
     int d = sc.nextInt();
     decToBin(d);

System.out.println("------------------------------------------");
    //average of three numbers
    System.out.println("Enter any three number for average :");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println("Average of three numbers are :"+Avg(a,b,c));

System.out.println("------------------------------------------");
    //Even or odd
    System.out.println("Enter the no is even or odd :");
    int E = sc.nextInt();
    if(isEven(E)){
        System.out.println("Number is Even");
    }else{
         System.out.println("Number is Odd");
    }
    
System.out.println("------------------------------------------");
    //Check number is palindrome or not 
    
    System.out.println("Check number is palindrome or not :");
    int palindrome = sc.nextInt();

    if(isPalindrome(palindrome)){
        System.out.println("The given number  is palindrome");
    }else{
        System.out.println("The given number is palindrome");
    }
 }
}   