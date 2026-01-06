//Assignment Questions
import java.util.*;
public class Strings2{

    //Count how many times lower case vowels occurred in a String entered by the user.
    public static int NoOfVowels(){
       System.out.println("Enter any line to count NO of vowels :");

       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int count = 0;

       for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
       }
        return count;
    }
    //what will be the output 
    public static void practice(){
        System.out.println("___________________________");

        String str="ShradhaDidi";
        String str1="ApnaCollege";
        String str2="ShradhaDidi";
        System.out.println(str.equals(str1) +" "+str.equals(str2));

        String str4="ApnaCollege".replace("l","");
        System.out.println(str4);
    }
    
    //Determine if 2 Strings are anagrams of each other  care <=> race
    public static void AnagramCheck(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter str1 :");
        String str1 = sc.nextLine().replaceAll("\\s","").toLowerCase();
        
        System.out.println("Enter str2 :");
        String str2 = sc.nextLine().replaceAll("\\s","").toLowerCase();
        
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Given strings are Anagram of each other");
        }else{
            System.out.println("Given strings are Not Anagram of each other");
        }
    }

    public static void main(String args[]){
      System.out.println("No of Vowels occured in string : "+NoOfVowels());
      practice();
      AnagramCheck();
    }
}