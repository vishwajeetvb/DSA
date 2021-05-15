
package mathematics;
import java.util.Scanner;

public class PAPN0MATH {

    public static void allPrimeSieveOfEratosthenes(int number){
          boolean[] prime = new boolean[number+1];
          //array initialize to true
          for(int i=0;i<prime.length;i++){
              prime[i]=true;
          }
          //main loop which increase value of i so we can falseify all multiples of i
          for(int i=2;i*i<=number;i++){
             if(prime[i]==true){
                 //this loop will falseify all the multiple of i starting form 4
                 for(int j=i*i;j<=number;j=j+i){
                     prime[j]=false;
                 }
             }
          }
          //This loop wil print all the primes 
          System.out.println("All the prime numbers below given number are: ");
          for(int i=2;i<prime.length;i++){            
            if(prime[i]==true){
                System.out.print(i+" ");
            }
         }
          
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number To Print all Divisors: ");
        int number = input.nextInt();
        allPrimeSieveOfEratosthenes(number);       
        
        input.close();
    }

    
}
