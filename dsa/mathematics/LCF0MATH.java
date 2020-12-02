package dsa.mathematics;

import java.util.Scanner;

public class LCF0MATH {

    public static int eucledianGCD(int num1,int num2) {
        if(num2==0){
            return num1;
        }else{
            return eucledianGCD(num2, num1%num2);
        }          
    }

    public static int LCMusingGCD(int a, int b)
    {
        return (a / eucledianGCD(a, b)) * b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two number to find out LCM");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int gcd = LCMusingGCD(num1,num2);
        System.out.println("LCM is: "+gcd);
        input.close();
    }
}
