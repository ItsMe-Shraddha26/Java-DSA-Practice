import java.util.*;

public class twoDarray{

   //TWO D ARRAY
    public static void Array(int matrix[][]){     
      int n = matrix.length; 
      int m = matrix[0].length;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a 9 numbers :");
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
          matrix[i][j] = sc.nextInt();
        }
      }
      //output
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
           System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
    }
     
     //SEARCH FOR A KEY
    public static boolean Search(int matrix[][],int key){
       for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j] == key){
               System.out.println("key is found at index :("+i+","+j+")");
                return true;
            }
        }
       }
        System.out.println();
        return false;
    }

    //LARGEST ELEMENT IN 2D ARRAY
    public static void Largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;

        for(int i=0; i<matrix.length; i++){
          for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j] > largest){
              largest = matrix[i][j];
              row = i;
              col = j;
            }
          }
        }
        System.out.println("Largest element in array is :"+largest+ "at index ("+row+","+col+")");      //("+i+","+j+")
    }
    
    //SPIRAL MATRIX
    public static void Spiral(int Matrix[][]){
      System.out.println("SPIRAL MATRIX :");
      
      int startRow = 0;
      int startCol = 0;
      int endRow = Matrix.length-1;
      int endCol = Matrix[0].length-1;

      while(startRow <= endRow && startCol <= endCol){
        //top
        for(int j=startCol; j<=endCol; j++){
          System.out.print(Matrix[startRow][j]+" ");
        }

        //Right
        for(int i=startRow+1; i<=endRow; i++){
          System.out.print(Matrix[i][endCol]+" ");
        }

        //Bottom
        for(int j=endCol-1; j>=startCol; j--){
          if(startRow == endRow){
            break;
          }
          System.out.print(Matrix[endRow][j]+" ");
        }

        //Left
        for(int i=endRow-1; i>=startRow+1; i--){
          if(startCol == endCol){
            break;
          }
          System.out.print(Matrix[i][startCol]+" ");
        }

        startCol++;
        startRow++;
        endCol--;
        endRow--;
      }
      System.out.println();
    }
    
    //DIAGONAL SUM OF MATRIX
    public static int diagonalSum(int Matrix[][]){
      System.out.println("Diagonal Sum :");
      int sum =0;

      /*for(int i=0; i<Matrix.length; i++){    //O(n^2)
        for(int j=0; j<Matrix.length; j++){
          if(i==j){
            sum += Matrix[i][j];
          }else if(i+j == Matrix.length-1){
            sum += Matrix[i][j];
          }
        }
      }
      return sum;*/

      for(int i=0; i<Matrix.length; i++){      //O(n)
        if(i == i){
          sum += Matrix[i][i];
        }
        if(i != Matrix.length-1-i){
          sum += Matrix[i][Matrix.length-1-i];
        }
      }
      return sum;
    }

    //SEARCH KEY IN SORTED ARRAY
    public static boolean stairCaseSearch(int Matrix[][]){
      int key = 14;
      int row = 0;                        //O(n+m)
      int col = Matrix[0].length-1;

      while(row <= Matrix.length-1 && col >=0){

        if(key == Matrix[row][col]){
          System.out.println("key found at index :("+row+","+col+")");
          return true;
        }
        if( key < Matrix[row][col]){
          col--;
        }else{
          row++;
        }
      }
      System.out.println("Key is not found");
      return false;
    }
   
    public static void main(String args[]){
      int matrix[][] = new int[3][3];
      int key = 5;
      //Array(matrix);
      //Search(matrix,key);
      //Largest(matrix);

      int Matrix[][] = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
      };
      Spiral(Matrix);
      System.out.println("Diagonal Sum :"+diagonalSum(Matrix));
      stairCaseSearch(Matrix);
    }
}