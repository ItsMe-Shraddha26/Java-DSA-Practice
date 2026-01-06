import java.util.*;
public class Part13_2{

public static int getLargest(int num[]){
    int largest = Integer.MIN_VALUE;

    int smallest = Integer.MAX_VALUE;

    for(int i=1; i<num.length; i++){
        if(largest < num[i]){
            largest = num[i];
        }

        if(smallest>num[i]){
            smallest = num[i];
        }
    }
    System.out.println("Smallest value is :"+smallest);
    return largest;
}

public static int linearSearch(int arry[], int key){
    for(int i=0; i<arry.length; i++){
        if(arry[i]==key){
            return i;
        }
        
    }
    return -1;
} 

public static int binarySearch(int numbers[],int key){
    int start= 0;
    int end = numbers.length-1;

    while(start<=end){
        int mid = (start+end)/2;

        if(key == numbers[mid]){
            return mid;
        }
        if(key < numbers[mid]){ //left
          end = mid-1;
        }else{              //right
            start=mid +1;
        }
    }
    return -1;
}

public static void reverse(int num[]){
    int start = 0,end = num.length-1;

    while(start<end){
       int temp = num[end];
       num[end] = num[start];
       num[start] = temp;

       start++;
       end--;
    }
}

public static void printPairs(int num[]){
    int tp = 0;
    for(int i=0; i<num.length-1; i++){
        int curr = num[i];
        for(int j=i+1; j<num.length; j++){
            System.out.print("("+curr + ','+ num[j]+")"+" ");
            tp++;
        }
        System.out.println();
    }
    System.out.println("Total number of pairs :"+tp);
}

public static void subArray(int array[]){
    int ts = 0;

    for(int i=0; i<array.length; i++){
        int start = i;

        for(int j=i; j<array.length; j++){
            int end = j;

            for(int k=start; k<=end; k++){
                System.out.print(array[k]+" ");

            }
            ts++;
            System.out.println();
        }
         System.out.println();
    }
    System.out.println("Total sub arrays are :"+ts);
}

public static void maxSubarraySum(int array[]){
    int maxSum = Integer.MIN_VALUE;
    int curr = 0;

    for(int i=0; i<array.length; i++){
        int start = i;
        
        for(int j=i; j<array.length; j++){
          int end = j;
          curr = 0;

          for(int k= start; k<=end; k++){
            System.out.print(array[k]+" ");
            curr += array[k];
            
          }
            System.out.print("= "+curr);
          if(maxSum<curr){
            maxSum = curr;
          }
          System.out.println();
        }
    }
    System.out.println("Maximun sub Array is : "+maxSum);
    
}
/***************************************************************** */
public static void main(String args[]){

    //linear search
    int arry[] = {23,45,13,45,78,97,9,6,5,10,35,6};
    int key = 6;

    int index = linearSearch(arry,key);
    if(index==-1){
        System.out.println("Number is not found");
    }else{
        System.out.println("Number is found at index:"+index);
    }

    //find the largest value

    int num[] = {34,6,54,2,35,1,67,89,7};
    int LargestValue =  getLargest(num);
    System.out.println("Largest value is:"+LargestValue);

    //Binary search
    int numbers[] = {2,4,6,8,10,12,14,16,18,20};
    int keys = 12;
    System.out.println("key is found at index: "+binarySearch(numbers,keys));

    // Reverse of an array
     int nums[] = {2,4,6,8,10};
   
    reverse(nums);
    for(int i=0; i<nums.length; i++){
        System.out.print(nums[i]+" ");
    }
    System.out.println();

    //Prit Pairs
    int pairs[] = {2,4,6,8,10};
    printPairs(pairs);

    //print Subarrays
    int arrays[] = {2,4,6,8,10,12};
    subArray(arrays);

    //Maximum sub array sum
    int subArray[] ={1,-2,6,-1,3};
    maxSubarraySum(subArray);
}
}
