import java.util.*;

public class Strings1{
    
    public static void inputOutput(){
        char arr[] = {'a','b','c','d'};
        String str2 = new String("String using new keyword");
        System.out.println(str2);
        
        System.out.println("Enter your name :");
        Scanner sc = new Scanner(System.in);
        String firstName;
        firstName = sc.nextLine();

        String LastName = "Sonawane";
        String fullName = firstName +" "+LastName;
        System.out.println(fullName + " , length: "+ fullName.length()+" "+ fullName.charAt(0));
    }
    
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    //Check if string is palindrome or not
    public static boolean isPalindrome(){
        String str = "madam";

        for(int i=0; i<str.length()/2; i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
              System.out.println(" String is Not palindrome");
              return false;
            }
        }
        System.out.println(" String is palindrome");
        return true;
    }
    //Find the shortest path
    public static float getShrtestPath(){
        String path = "WNEENESENNN";
        int x=0;
        int y=0;

        for(int i=0; i<path.length(); i++){
            int dir = path.charAt(i);
            
            //south
            if(dir == 'S'){
                y--;
            }

            //North
            else if(dir == 'N'){
                y++;
            }

            //East
            else if(dir == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    
    //Comparision of two Strings in java
    public static void compareStrings(){
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");

        if(str1 == str2){
            System.out.println("Strings s1 and s2 are equal");
        }else{
            System.out.println("Strings s1 and s2 are not equal");
        }

        if(str1 == str3){
            System.out.println("Strings s1 and s3 are equal");
        }else{
            System.out.println("Strings s1 and s3 are not equal");
        }
         
         //if wanna check values use equals() function
        if(str1.equals(str3)){
            System.out.println("Strings s1 and s3 are equal");
        }else{
            System.out.println("Strings s1 and s3 are not equal");
        }
    }

    //SubSrings in given string
    public static String subString(){
        String subStr = "";
        String str = "HelloWorld";
        int sIndex = 0;
        int eIndex = 5;
       
       System.out.println(".substring() is : "+ str.substring(5,10));
        
        for(int i=sIndex; i<eIndex; i++){
          subStr += str.charAt(i);
        }
        return subStr;
    }

    //Compareto function to find largest string
    public static void largestString(){               //O(x*n)
        String fruits[] ={"apple","banana","mango"};
        String largest = fruits[0];

        for(int i=1; i<fruits.length; i++){
           if(largest.compareTo(fruits[i]) < 0){
            largest = fruits[i];
           }
        }
        System.out.println("Largest string is :"+largest);
    }
    //StringBuilder structure insted of string
    public static void stringBuilder(){
        StringBuilder sb = new StringBuilder("");

        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println("Using string builder :"+sb+" "+sb.length());
    }

    //In a given string Convert first letter in a word toUpperCase
    public static String toUpperCase(){
        String str = "hi, i am shraddha";

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i< str.length()-1){
               sb.append(str.charAt(i));
               i++;
               sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    } 
    
    //Compress a string aaabbc => a3b2c
    public static String compress(){           //O(n)
        String str = "aaabbc";

        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count =1;
            while(i < str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main (String args[]){
       
        String sirName = "Sonawane";
        //inputOutput();
        printLetters(sirName);
        System.out.println(isPalindrome());
        System.out.println("Shortest path is : "+getShrtestPath());

        compareStrings();
        System.out.println("subString is : "+subString());
        largestString();
        stringBuilder();
        System.out.println("converted toUpperCase() : "+toUpperCase());
        System.out.println("Compressed String is : "+compress());
    }
}