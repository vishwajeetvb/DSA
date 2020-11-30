package dsa.mathematics;

import java.util.Scanner;

public class FN0MATH {

    //recursive factorial method where T.C IS 0(N) and A.S.C is 0(N) 
    public static int recursiveFactorial(int number){
        if(number==0){
            return 1;
        }
        return number*recursiveFactorial(number-1);
    }

    //iterative factorial method where T.C is 0(n) 
    public static int iterativeFactorial(int number) {
        int factorial=1;
        while(number>0){
           factorial*=number;
           number--;
        }
        return factorial;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number To Find Factorial of Number: ");
        int number = input.nextInt();
        //int factorial = iterativeFactorial(number);
        int factorial = recursiveFactorial(number);
        System.out.println("Factorial Of Given Number is: "+factorial);
        input.close();
    }
    
}
