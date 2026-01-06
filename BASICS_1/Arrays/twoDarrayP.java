// Practice questions
import java.util.*;

public class twoDarrayP{

    //Print the number of 7’s that are inthe 2d array
    public static int CountRepetions(){
       int matrix[][] = {{4,7,8},{8,8,7}};
       //int key = 7;
       int count = 0;
       
       System.out.println("Enter no who's frequency you wanna count :");
       Scanner sc = new Scanner(System.in);
       int key = sc.nextInt();
       
       for(int i=0; i<=matrix.length-1; i++){
          for(int j=0; j<=matrix[0].length-1; j++){
            if(key == matrix[i][j]){
                count++;
            }
          }
       }
       return count;
    }
    
    //Print out the sum of the numbers inthe second row of the “nums” array.
    public static int SumOfSecondRow(){
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        int sum = 0;

        for(int i=0; i<=nums.length-1; i++){
            for(int j=0; j<=nums[0].length-1; j++){
                if(i==1){
                    sum += nums[i][j];
                }
            }
        }
        return sum;
    }

    //Write a program to FindTransposeofa Matrix
    public static void TransposeMarix(){
        int matrix[][] = {
            {1,2,3},
            {4,5,6}
        };
        
        int row =matrix.length;
        int col = matrix[0].length;

        int transpose[][] = new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                //System.out.print(matrix[row][col]+" ");
                transpose[j][i] = matrix[i][j];
            }
            //System.out.println();
        }
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Number found "+CountRepetions()+" times");
        System.out.println("Sum of second row is :"+SumOfSecondRow());
        TransposeMarix();
    }
}