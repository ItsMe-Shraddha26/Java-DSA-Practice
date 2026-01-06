import java.util.*;
public class conditional{
    public static void main(String [] arg){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter an age :");
        int age =sc.nextInt();
        
        if(age>=18){
            System.out.println("You can vote");
        }else{
            System.out.println("You can not vote");
        }
//else if statements
        if(age>=18){
            System.out.println("Adult");
        }else if(age>=13 && age<18){
            System.out.println("Teenage");
        }else{
            System.out.println("Child");
        }
 //Tax calculator  
        System.out.println("Enter the salary : ");
        int income = sc.nextInt();
       
        if(income<500000) {
           float tax=0;
           System.out.println("no tax");
        }else if(income>500000 && income<=1000000){
            float tax = income*0.2f;
            System.out.println("20% income tax :"+ tax);
        } else if(income>1000000){
            float tax = income*0.3f;
            System.out.println("30% income tax :"+ tax);
        }else{
            System.out.println("I dont knw");
        }
//ternary operator
         System.out.println("Enter the number: ");
         int number= sc.nextInt();
         String no = ((number%2)==0)? "even":"odd";
         System.out.println("The given no is :" + no);
    
//Switch case
        System.out.println("Enter any num : ");
        int num = sc.nextInt();
        switch(num){
        case 1:System.out.println("samosa");
        break;
        case 2:System.out.println("burger");
        break;
        case 3:System.out.println("pizza");
        break;
        default:System.out.println("wake up ");
        }
 //calculator
      System.out.println("Enter value of a :"); 
      int a = sc.nextInt();
      System.out.println("Enter value of b :");
      int b = sc.nextInt();
      System.out.println("Enter the char like +,-,*,/ :"); 
      char operator= sc.next().charAt();

      switch(operator) {
        case '+' :
            System.out.println("The addition of a and b is :"+ a+b);
            break;
         case "-" :
            System.out.println("The substraction of a and b is :"+ a-b);
            break; 
         case "/" :
            System.out.println("The division of a and b is :"+ a/b); 
            break;
         case "*":
            System.out.println("The multiplication of a and b is :"+ a*b);
            break;
        default:
            System.out.println("invalid char");
    
      }
    }
}