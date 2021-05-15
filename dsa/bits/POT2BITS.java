/* Here the idea is Biran's Algo
   which says to find if one set bits is present just by x-1 which will just toggle thenn element means if
   its 8 = 1000 then 7 = 0111 and then if we do x&(x-1) it will result in 0

   It's T.C is O(1)
*/
package bits;
import java.util.Scanner;

public class POT2BITS {
    public static boolean isPowerofTwo(long x){
        if(x==0){
            return false;
        }
        if((x&(x-1))==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        long number = input.nextLong();        
        boolean place = isPowerofTwo(number);
        System.out.println("Number is Power of Two: "+place);
        input.close();
    }
}
