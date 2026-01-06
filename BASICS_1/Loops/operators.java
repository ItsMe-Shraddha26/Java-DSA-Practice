import java.util.*;

public class operators{
   public static void main(String[]args){
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter a:");
      int a = sc.nextInt();
      String name= "Shraddha";
      
      //pre-increment
      int b = 6;
      int c = ++b;
      System.out.println(b);
      System.out.println(c);

      //post-increment
      int d = 6;
      int e = b++;
      System.out.println(d);
      System.out.println(e);

      //pre-decrement
      int f = 6;
      int g = --b;
      System.out.println(f);
      System.out.println(g);

      //post-decrement
      int h = 6;
      int i = b--;
      System.out.println(h);
      System.out.println(i);
   }
}
