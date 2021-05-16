//Here task is to print all the prime divisor of given number 



import java.util.Scanner;

public class DGN0MATH {

    public static void divisors(int number){
        for(int i=1;i*i<number;i++){
            if(number%i==0){
            System.out.print(i+" ");
            }
            if(i!=(number/i)){
                System.out.print(number/i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number To Print all Divisors: ");
        int number = input.nextInt();
        divisors(number);       
        
        input.close();
    }
    
}
