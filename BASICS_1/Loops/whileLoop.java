public class whileLoop{
    
    public static void oneToNprint(){
        System.out.println("No from 1 to 10");
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    public static void oneToNsum(){
        System.out.println("Sum of no 1 to 10 :");
        int i = 1;
        int sum = 0;
        while(i<=10){
            sum = sum + i;
            System.out.println(sum);
            i++;
        }
    } 
    
    //Print even numbers from 1 to N.
    public static void EvenNo(){
        System.out.println("Even no from 1 to 10 :");

        int i=2;
        while(i<=10){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
    
    //Print odd numbers from 1 to N.
    public static void OddNo(){
        System.out.println("odd no from 1 to 10 :");

        int i=1;
        while(i<=10){
            if(i%2 !=0){
               System.out.println(i);
            }
            i++;
        }
    }
    
    //Print the multiplication table of a number

    public static void multiplication(){
       System.out.println("Print the multiplication table of a number");
        int i=1;
        while(i<=10){
          System.out.println(i + " * 5 = " + (i * 5));
          i++;
        }
    }
    
    //Count the number of digits in an integer
    //Input: n = 12345 → Output: 5
    public static void digits(){
        System.out.println("Count the number of digits in an integer");
        int n = 187459684;
        int count = 0;

        while(0 < n){
            n = n/10;
           count++;
        }
        System.out.println(count);
    }

    //Reverse a number using a while loop
    public static void Reverse(){
        System.out.println("Reverse a number using a while loop");

        int n = 12345;
        int rev =0;

        while(0 < n){
            int lastDigit = n%10;
            rev = rev*10 + lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }

    //Check if a number is a Palindrome
    public static void  Palindrome(){
        System.out.println("Palindrome =>");

        int n= 121;
        int original =n;
        int rev =0;

        while(0 < n){
            int lastDigit = n%10;
            rev = rev*10 + lastDigit;
            n = n/10;

        }
        if(original == rev){
            System.out.println(original +" is palindrom");
        }
    }

    // Check if a number is an Armstrong number
    public static void Armstrong(){
        System.out.println("Armstrong =>");

        int n = 153;
        int original = n;
        int sum = 0;

        while(0 < n){
            int lastDigit = n%10;
            int cube = lastDigit * lastDigit * lastDigit;
            sum += cube;
            n = n / 10;
        }
        System.out.println("Sum of cubes of digits: " + sum);
        if(original == sum){
            System.out.println(original +" is Armstrong no");
        }
    }

    //Print Fibonacci series up to N terms using while loop
    public static void Fibonacci(){
        System.out.println("Fibonacci =>");
        
        int first = 0, second = 1;
        int count = 1;
        
        System.out.println("Fibonacci Series up to "  + " terms:");

        while (count <= 10) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            count++;
        }

    }
    
    //Check if a number is Prime using while loop
    public static void checkPrime(){
        boolean isPrime = true;
        int n = 29;
        
        if(n<=1){
          isPrime = false;
        }else{
          int i =2;
          while(i <= n/2){
            if(n % i == 0){
                isPrime = false;
                break;
            }
            i++;
          }
        }

        if(isPrime){
            System.out.println(n +"is prime no");
        }else{
            System.out.println(n +" is not prime no");
        }
    }
    //Find GCD
    public static void findGCD(){
        System.out.println("GCD of 48 and 18:");

       int a=48 , b=18;

       while(b != 0){
        int temp = b;
        b = a % b;
        a = temp;
       }
       System.out.println(a);
    }

    //Count the frequency of digit 5 in a number
    public static void countDigitFive(){
        int n= 5252355;
        int count =0;

        while(0 < n){
            int lastDigit = n%10;
            if(lastDigit == 5){
                count++;
            }
            n = n/10;
        }
        System.out.println("the frequency of digit 5 is  "+count);
    }

    //Sum of all even digits in a number
    public static void sumEvenDigits(){
        long n = 6235487823788L;
        long sum = 0;

        while(n>0){
            long lastDigit = n%10;
            if(lastDigit % 2 ==0){
               sum = sum+ lastDigit;
            }
            n = n/10;
        }
        System.out.println("Sum of even no's are :"+sum);
    }

    // Find the largest digit in a number
    public static void findLargestDigit(){
        int n = 892516;
        int max = 0;

        while(n>0){
            int lastDigit = n%10;
            if(lastDigit > max){
                max = lastDigit;
            }
            n = n/10;
        }
        System.out.println("The largest digit is :"+max);
    }
    public static void main(String[]args){
        oneToNprint();
        oneToNsum();
        EvenNo();
        OddNo();
        multiplication();
        digits();
        Reverse();
        Palindrome();
        Armstrong();
        Fibonacci();
        checkPrime();
        findGCD();
        countDigitFive();
        sumEvenDigits();
        findLargestDigit();
    }
}