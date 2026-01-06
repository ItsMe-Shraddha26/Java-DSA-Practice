import java.util.*;

public class sorting{
    
    //BUBBLE SORTING 
    public static void BubbleSorting(int arr[]){
        System.out.println("Bubble sorting => ");

        int swap = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 

                    swap++;
                }
            }
        }
         System.out.println("Total swaps :"+swap);
    }
    
    //SELECTION SORT
    public static void selectionSort(int arr[]){
        System.out.println("Selection Sort => ");

        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    //INSERTION SORT
    public static void insertionSort(int arr[]){
        System.out.println("Insertion Sort => ");
       for(int i=1; i<arr.length; i++){
        int curr = arr[i];
        int prev = i-1;
        
        //find correct position
        while(prev >= 0 && arr[prev] > curr){
            arr[prev + 1] = arr[prev];
            prev--;
        }
        //insertion
        arr[prev+1] = curr;
       }
    }
    //COUNTING SORT
    public static void countingSort(int arr[]){
        System.out.println("Counting Sort => ");
       int largest = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
        largest = Math.max(largest , arr[i]);
       }

       int count[] = new int[largest+1];
       for(int i=0; i<arr.length; i++){
        count[arr[i]]++;
       }
       
       int j=0;
       for(int i=0; i<count.length; i++){
          while(count[i] > 0 ){
            arr[j] = i;
            j++;
            count[i]--;
          }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        //BubbleSorting(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //Arrays.sort(arr,0,3);         //Inbuilt
        countingSort(arr);
        printArr(arr);
    }
}