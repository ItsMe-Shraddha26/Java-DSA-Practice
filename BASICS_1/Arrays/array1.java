import java.util.*;

public class array1{

    public static void InputOutput(int no[]){

        System.out.println("Updated Numbers :");
        for(int i=0; i<no.length; i++){
            no[i] = no[i]+1;               //passing array as argument
            System.out.print(no[i]+" ");
        }
        
        String fruits[]={"mango","banana","Apple"};
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);

        int marks[] = new int[20];
        
        System.out.println("Enter marks for 3 sub:");
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        String sub[] = {"chem","phy","math"};

        for(int i=0; i<sub.length; i++){
            System.out.println(sub[i]+" :marks[" + i + "] :" +marks[i]);
        }
        
    }

    //Linear Search
    public static int linearSearch(int Numbers[],int key){
        System.out.println("Linear Search =>");

        for(int i=0; i<Numbers.length; i++){
            if(Numbers[i]==key){
                System.out.println("Number found for linear search at index :"+i);
               return i;
            }
        }
        return -1;
    }
    
    //Find the largest number in array
    public static void largestNo(int arr[]){
       //int arr[] = {32,2,23,45,43,3};
       int largest = Integer.MIN_VALUE;  //minus infinity

        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
             largest = arr[i];
            }
        }
        System.out.println("Largest no is :"+ largest);
    }
    
    //Binary Search
    public static int binarySearch(){
        int arr[] = {1,2,3,4,5,6,7,8};
        int key = 2;
        int start = 0; 
        int end = arr.length - 1;

        while(start<=end){
            int mid = (start + end)/2;

            //comparision
            if(arr[mid] == key){
               return mid;
            }
            if(arr[mid] < key){  //right
              start = mid +1;
            }else{               //left
                end = mid - 1;
            }
        }
        return -1;
    }

    //Reverse an Array
    public static void reverse(){
        System.out.println("Reverse an Array=> ");

        int array[] = {10,9,8,7,11};
        int start = 0;
        int end = array.length-1;

        while(start < end){
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;

            start ++;
            end --;
        }

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    //Pairs in an Array
    public static void pairs(){
        System.out.println("Pairs in an Array :");
        int numbers[] = {2,4,6,8,10};
        int tp = 0;

        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
              System.out.print( "("+curr +"," + numbers[j]+")");
              tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs :"+tp);
    }

    //Print subArrays
    public static void subArrays(){
        System.out.println("Sub Arrays :");
        int array[] = {2,3,4,5,6};

        for(int i=0; i<array.length; i++){
            int start = i;
            for(int j=i; j<array.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(array[k] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    //Maximum subArray Sum
    public static void MaxSubArraySum(){
        System.out.println("Maximum subArray Sum => ");
       int array[] = {1,-2,6,-1,3};
       int max = Integer.MIN_VALUE;

       for(int i=0; i<array.length; i++){
        int start = i;
        for(int j=i; j<array.length; j++){
            int end = j;
            int sum = 0;
            for(int k=start; k <=end; k++){
                System.out.print(array[k]+" ");
                sum += array[k];
            }
            System.out.println("=>Sum :"+sum+" ");

            if(sum > max){
                max = sum;
            }
           
        }
        System.out.println();
       }
       System.out.println("Maximum Subarray Sum: " + max);
    }
    
    //Maximum subArray Sum using prefix sum
    public static void prefixSum(){
       int array[] = {1,-2,6,-1,3};
       int maxSum = 0;
       int currSum = 0;

       int prefix[] = new int[array.length];

       prefix[0] = array[0];

       for(int i=1; i<prefix.length; i++){
        prefix[i] = prefix[i-1] + array[i];
       }

       for(int i=0; i<array.length; i++){
        int start = i;
        for(int j=i; j<array.length; j++){
            int end=j;

            currSum = start==0 ? prefix[end]: prefix[end] - prefix[start-1];
            
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
       }
        System.out.println("Maximum Subarray Sum using PrefixSum : " + maxSum);
    }

    //Maximum subArray Sum using Kadans Method
    public static void kadans(){
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        int maxSum = Integer.MIN_VALUE;   //-infinity
        int currSum = 0;

        for(int i=0; i<array.length; i++){
            currSum = currSum + array[i];

            if(currSum < 0){              //if all numbers are -ve then maxSum=0
                currSum = 0;
            }

            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
        System.out.println("Maximun subArraySum using kadans :"+maxSum);
    }
     
    // Maximum subArray Sum using Kadane's Method (handles all negatives)
    public static void kadansForNegativeNo(){
        int arr[] = {-2,-3,-4,-1,-2,-1,-5,-3};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean allNegative = true;
        int maxNegative = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
           
           if(arr[i] >= 0){
            allNegative =false;

           }else{
             if(maxNegative < arr[i]){
                maxNegative = arr[i];
             }
           }

           currSum = currSum + arr[i];

           if(currSum <=0){
            currSum = 0;
           }
           if(maxSum < currSum){
               maxSum = currSum;
           }
        }

        if (allNegative) {
            System.out.println("Maximum subArraySum (all negative case): " + maxNegative);
        } else {
            System.out.println("Maximum subArraySum using Kadane's: " + maxSum);
        }

    }

    //Trapped Rain water
    public static int trappedWater(){
        int height[] = {4,2,0,6,3,2,5};
        int n = height.length;

        int leftMax[] = new int [height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max( leftMax[i-1] , height[i]);
        }

        int rightMax[] = new int [height.length];
        rightMax[n - 1] = height[n - 1];
        for(int i= n-2; i>=0; i--){
            rightMax[i] =  Math.max(rightMax[i +1] ,height[i]);
        }
        
        int  TrappedWater = 0;
        for(int i=0; i<n; i++){
           int WaterLevel = Math.min( leftMax[i] ,rightMax[i]);
            TrappedWater += WaterLevel - height[i];
        }

        return TrappedWater;
        
    }
    
    //Buy and sell Stoks 
    public static void buyAndSellStick(){
        int prices[] ={7,1,5,3,6,4};
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        int buyDay = 0;
        int sellDay = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;

                maxProfit = Math.max(maxProfit,profit);
                sellDay = i;
            }else{
                buyPrice = prices[i];
                buyDay =i;
            }
        }
        System.out.println("Buy on day " + buyDay + " (price " + prices[buyDay] + ")");
        System.out.println("Sell on day " + sellDay + " (price " + prices[sellDay] + ")");
        System.out.println("Maximum profit is: " + maxProfit);
    }
    public static void main(String args[]){
        int No[] = {1,2,3,4,5};
        InputOutput(No);

        int Numbers[] = {2,3,4,8,5,2};
        int key = 5;

        int index = linearSearch(Numbers,key);
        if(index == -1){
           System.out.println("No not found ");
        }

        largestNo(Numbers);
        System.out.println("index for binary serch key is :"+binarySearch());

        reverse();
        pairs();
        subArrays();
        MaxSubArraySum();
        /*prefixSum();
        kadans();
        kadansForNegativeNo();
        System.out.println("Trapped Rain water :"+ trappedWater());
        buyAndSellStick(); */
    }
}