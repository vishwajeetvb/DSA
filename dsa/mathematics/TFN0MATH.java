

import java.util.Scanner;

public class TFN0MATH {

    /*Here the concept is to count no of 5's in the prime factor of given number
      The formula is floor of [number/5]+[number/25]+[number/125]+[number/625]+...
      OR just divide the number recursively with 5 */  
    public static int trailingZeroFactorial(int number) {
        int noOfZero = 0;
        while(number/5>0){
             noOfZero+=(number/5);
             number/=5;
        }
        return noOfZero;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number To Find No of Zero's in Factorial of Number: ");
        int number = input.nextInt();
        //int factorial = iterativeFactorial(number);
        int factorial = trailingZeroFactorial(number);
        System.out.println("Factorial Of Given Number is: "+factorial);
        input.close();
    }
    
}
