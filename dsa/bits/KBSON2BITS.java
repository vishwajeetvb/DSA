/*Here the idea is very simple we have two number we need to find first diff bits
  As we know XOR return value 0 if bits are same
  so when we XOR both the number we get 1 at first set bits and after that all bits become 0
  so now after XOR the problem reduces to find position of first set Bit

  It's T.C will be O(logn)
*/

import java.util.Scanner;

public class KBSON2BITS {
    static int firstSetBit(int n){
        if(n==0){
            return 0;
        }        
        int i=0;
        while(n>0){
            if((n&1)==1){break;}
            n=(n>>1);            
            i++;            
        }
        return i+1;
    }
    
    static int posOfRightMostDiffBit(int m, int n)
    {return firstSetBit(m^n);}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int number1 = input.nextInt();  
        System.out.println("Enter the Second Number: ");
        int number2 = input.nextInt();       
        int place = posOfRightMostDiffBit(number1,number2);
        System.out.println("The First Set Bit is: "+place);
        input.close();
    }
}
