public class Part_10{
    public static void main (String []arg){
        //right angle triangle pattern
        System.out.println("right angle triangle pattern :");
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Inverted right angle triangle pattern
        System.out.println("Inverted right angle triangle pattern :");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //print half pyramid pattern
        System.out.println("print half pyramid pattern");
        for (int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                //print half pyramid pattern
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}