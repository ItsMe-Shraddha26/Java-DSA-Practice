public class part18{

    public static void OddEven(int n){
        int bitMask = 1;
        if((n & bitMask)== 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
    //Finding the Ith position bit in given NO
    public static void getIyhBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
           System.out.println("Ith position bit is 0 ");
        }else{
            System.out.println("Ith position bit is 1 ");
        }
    }
    //set the Ith position bit in given 1 NO to 0
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    //set the Ith position bit in given NO 0 to 1
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    //update the Ith bit
    public static int updateIthBit(int n,int i,int newBit){
        if(newBit == 1){
            int bitMask = 1<<i;
            return n | bitMask; 
        }else{
            int bitMask = ~(1<<i);
            return n & bitMask;
        }
    }
    //Clear last i bits 1111 => 1100 , i=2   ans=1100(12)
    public static int ClearLastIBits(int n, int i){
       int bitMask = ((-1)<<i);
       return n & bitMask;
    }
    //Clear Range of bits 
    public static int ClearRangeOfIBits(int n, int i,int j){
        int a = ((~0)<<(j+1));     //11111000
        int b = (1<<i)-1;          //0000011
        int bitMask = a|b;
        return n & bitMask;
    }
    //Check if a number is a power of 2 or not
    public static boolean isPower(int n){
        return (n&(n-1)) == 0;
    }
    
    //Count set bits in a number
    public static int CountSetBits(int n){
        int count = 0;
        while(0 < n){
            if((n & 1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    //Fast Exponential a*n = ans
    public static int FastExpo(int a, int n){
        int ans =1;
        while(n>0){
            if((n&1)!=0){
               ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return  ans;
    }
    public static void main(String args[]){
        OddEven(3);
        OddEven(4);
        getIyhBit(5,2);
        System.out.println("set bit at Ith position 0 to 1 so ans : "+setIthBit(10,2));
        System.out.println("clear bit at Ith position 1 to 0 so ans : "+clearIthBit(10,1));
        System.out.println("update bit at Ith position 1 to 0 or vise varsa ans : "+ updateIthBit(10,1,0));
        System.out.println("CLear Laast I positions bits : "+ ClearLastIBits(15,2));
        System.out.println("Clear Range of bits : "+ ClearRangeOfIBits(10,2,4));
        System.out.println("number is a power of 2 or not : "+ isPower(4));
        System.out.println("Count set bits in a number : "+ CountSetBits(10));
        System.out.println("Fast Exponential a*n = ans : "+FastExpo(3,5));
    }
}