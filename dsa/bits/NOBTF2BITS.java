/*This program basic idea is to first xor both number such that we get 1 only on 
those places where we need to flip means where the bits are diff
then we just return no of bits
*/
package bits;
import java.util.Scanner;

public class NOBTF2BITS {
    static int countBitsFlip(int a, int b){    
        // Your logic here
        int num = a^b;
        int count=0;
        while(num!=0){
            num&=(num-1);
            count++;
        }
        return count;        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int number1 = input.nextInt();  
        System.out.println("Enter the Second Number: ");
        int number2 = input.nextInt();       
        int place = countBitsFlip(number1,number2);
        System.out.println("Required Bits are: "+place);
        input.close();
    }
}
