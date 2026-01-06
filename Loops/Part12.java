public class Part12{
    // function - Pattern of Hollo Rctangle
    public static void hollo_rectangle(int TotRow,int TotCol){
        // outer loop
        for(int i=1; i<=TotRow; i++){
            // inner loop
            for(int j=1; j<=TotCol; j++){
                //cell-i,j
                if(i==1 || i==TotRow ||j==1 ||j==TotCol){
                    //boundry
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    //Inverted and Roteted halaf pyramid
    public static void invertedPyramid(int n){
        //Rows
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Inverted half pyramid with numbers
    public static void Inverted_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Floyds Triangle
    public static void FloysTriangle(int m){
        int counter =1;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    // zero_one triangle
    public static void zero_one_triangle(int x){
         for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                 System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
         }
    }

    //Butterfly pattern
    public static void butterfly(int y){
        //1st half
        for(int i=1; i<=y; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(y-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=y; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(y-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Solid Rhoumbus
    public static void SolidRhoumbus(int z){
        for(int i=1; i<=z; i++){
            //spaces
           for(int j=1; j<=z-i; j++){
            System.out.print(" ");
           }
           //stars
           for(int j=1; j<=z; j++){
            System.out.print("*");
           }
           System.out.println();
        }
    }

    //Hollow Rhoumbus
    public static void HollowRhoumbus(int p){
        for(int i=1; i<=p; i++){
            //spaces
            for(int j=1; j<=p-i; j++){
                System.out.print(" ");
            }
            //boundry of rectangle
            for(int j=1; j<=p; j++){
                if(i==1 || i==p || j==1 || j==p){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //Diamond pattern
    public static void DiamondPattern(int Q){
        for(int i=1; i<=Q; i++){
            //spaces
            for(int j=1; j<=Q-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=Q; i>=1; i--){
            //spaces
            for(int j=1; j<=Q-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 //**************************************************************** */
    public static void main(String []args){
        // FunCall - Pattern of Hollo Rctangle
        hollo_rectangle(4,5);

 System.out.println("---------------------------------------");
        //Function - inverted Pyramid
        invertedPyramid(5);

 System.out.println("---------------------------------------");
        //Inverted half Spyramid
        Inverted_half_pyramid(5);

 System.out.println("---------------------------------------");
        //Floys Triangle
        FloysTriangle(5);

 System.out.println("---------------------------------------");
        //zero one triangle
        zero_one_triangle(5);

 System.out.println("---------------------------------------");
        //butterfly pattern
        butterfly(5);

 System.out.println("---------------------------------------");
        //Solid Rhoumbus
        SolidRhoumbus(5);
 
 System.out.println("---------------------------------------");
        //Hollow Rhoumbus
        HollowRhoumbus(5);

        //Diamond Pattern
 System.out.println("---------------------------------------");
        DiamondPattern(5);
    }
}