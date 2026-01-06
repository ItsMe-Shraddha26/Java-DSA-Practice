public class pattern{
     
    //print half Pyramid Star Pattern
    public static void halfPyramidStarPattern(){
        System.out.println("print half Pyramid Star Pattern =>");

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //print half Pyramid number Pattern
    public static void halfPyramidNoPattern(){
        System.out.println("print half Pyramid number Pattern =>");

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //print half inverted Pyramid Reverse number Pattern
    public static void invertedPyramidReverseNo(){
        System.out.println("print half inverted Pyramid Reverse number Pattern =>");

       for(int i=1; i<=5; i++){
        for(int j=5; j>=i; j--){
            System.out.print(j+" ");

        }
        System.out.println();
     }
    }

    //print half inverted Pyramid number Pattern
    public static void invertedPyramid(){
        System.out.println("print half inverted Pyramid  number Pattern =>");
        
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
              System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    //Floy'd Triangle
    public static void floyd(){
        System.out.println("Floy'd Triangle =>");
        int count = 1;

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
              System.out.print(count+" ");
              count++;
            }
            System.out.println();
        }
    }

    //0 or 1 Triangle
    public static void zeroOneTriangle(){
        System.out.println("0 or 1 Triangle =>");

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }

    }

    //print half Pyramid charecter Pattern
    public static void halfPyramidCharector(){
        System.out.println("print half Pyramid charecter Pattern =>");
        char ch = 'A';

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
               System.out.print(ch+" ");
               ch++;
            }
            System.out.println();
        }
    }
    
    // Reversed Half Pyramid (Upside-Down) 
    public static void reversedHalfPyramidCharacter(){
        System.out.println("Reversed Half Pyramid (Upside-Down) =>");
        char ch = 'A';

        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    //Roteted half Pyramid
    public static void RotetedPyramid(){
        System.out.println("Roteted half Pyramid =>");
        int n=5;

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    //Hollow rectangle star pattern
    public static void HollowRectangle(){
        System.out.println("Hollow rectangle star pattern =>");
         
        for(int i=1; i<=5; i++){
           for(int j=1; j<=4; j++){
             if(i==1 || i==5 || j==1 ||j==4){
                System.out.print("*");
             }else{
                System.out.print(" ");
             }
           }
           System.out.println();
        }
    }

    //Print Butterfly star pattern 
    public static void Butterfly(){
        System.out.println("Butterfly pattern =>");
        int n=5;

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    //Diamond Pattern
    public static void Diamond(){
        System.out.println("Diamond Pattern =>");
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Solid Rhombus
    public static void SolidRhombus(){
        System.out.println("Solid Rhombus =>");
        int n= 5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
              System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
              System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        halfPyramidStarPattern();
        halfPyramidNoPattern();
        invertedPyramid();
        invertedPyramidReverseNo();
        floyd();
        zeroOneTriangle();
        halfPyramidCharector();
        reversedHalfPyramidCharacter();
        RotetedPyramid();
        HollowRectangle();
        Butterfly();
        Diamond();
        SolidRhombus();
    }
}