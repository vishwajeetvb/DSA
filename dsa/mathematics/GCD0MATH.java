package dsa.mathematics;

import java.util.Scanner;

public class GCD0MATH {

    /*T.C will be O(m), where m is minimum of both number.
     Basic approach is to find minimum of two numbers and 
     then run a loop to find out the number that divide both numbers
     if we find that number break and return unless keep decreasing
     and break on 1 */
    public static int naiveGCD(int num1,int num2) {
       int result = Math.min(num1, num2);
       while(result>0){
           if(num1%result==0&&num1%result==0){
               break;
           }
           result--;
       }
        return result;
    }

    /*T.C. would be O(log(min(num1,num2)))*/ 
    public static int eucledianGCD(int num1,int num2) {
        if(num2==0){
            return num1;
        }else{
            return eucledianGCD(num2, num1%num2);
        }  
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two number to find out");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int gcd = eucledianGCD(num1,num2);
        System.out.println("GCD is: "+gcd);
        input.close();
    }
    
}
