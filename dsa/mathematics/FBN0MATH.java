//For concept refer to below link
//https://algotree.org/algorithms/numeric/large_factorials/
package dsa.mathematics;

import java.util.Scanner;

public class FBN0MATH {

    public static void iterativeBigNumberFactorial(int number) {
        int[] store = new int[1000];
        int result=number;
        int index=0;
        // Store the number in the reverse order. 
        // Example: Number 123 is stored as 3, 2, 1
        //                                  ^  ^  ^
        //                                  |  |  |
        //                          Index   0  1  2
        while(result>=1){
            store[index++]=result%10;
            result/=10;
        }
        number--;  
        int carry=0;      
        while (number > 0) {
            int i = 0;
            while (i < index) {
                result = store[i] * number + carry;
                store[i++] = result%10;
                carry = result/10;
            }
            while (carry > 0) {
                store[i++] = carry%10;
                carry /= 10;
            }
            number -= 1;
            index = i;
        }
        for (int i=index-1; i>=0; i--) {
            System.out.print(store[i]);
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number To Find Factorial of Number: ");
        int number = input.nextInt();
        System.out.print("Factorial Of Given Number is: ");
        iterativeBigNumberFactorial(number);
            
        input.close();
    }
}
