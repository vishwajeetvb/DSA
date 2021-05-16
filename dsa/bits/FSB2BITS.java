/*In this algo teh idea is to find first set bit is
  First we need to take out the first set bit to the end of our Number
  Means if Number is 18=10010 then we need to do something such that we make it 01001 
  Now to detect that we get 1 at end we need to do and with 1 as in 1 only end bit is 1 and all else is 0
  so when we do & with 1 it result in 1 again
  Because any number x&1=x;
  And when we get 1 we return i+1;
  as we need to return position which will be always i+!

  It's T.C will be O(logn)
*/

import java.util.Scanner;

class FSB2BITS{

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = input.nextInt();        
        int place = firstSetBit(number);
        System.out.println("The First Set Bit is: "+place);
        input.close();
    }
}