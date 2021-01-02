package dsa.mathematics;

import java.util.Scanner;

public class PD0MATH {

    /*My own method where i convert the number into string and then compare both the string chatAt 
      one string from starting index
      another string from last index
      if it does not matches it return false
      if all charAt matches then it return true */
    public static boolean pallindromeNumberString(int number) {
        String s1 = Integer.toString(number);
        String s2 = s1;
        int i=0;
        int length = s2.length();
        while(i<s1.length()){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(length-(i+1)); 
            if(c1!=c2){
                return false;
            }
            i++;
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number To Check Whether it's Pallindrome or Not: ");
        int number = input.nextInt();
        
        System.out.println(" Given Number is Pallindrome: "+pallindromeNumberString(number));
        input.close();
    }
    
}
