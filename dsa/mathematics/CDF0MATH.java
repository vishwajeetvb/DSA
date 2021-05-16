
import java.util.Scanner;

/*Conecpt in this Algo is
    We know,
    log(a*b) = log(a) + log(b)

    Therefore
    log( n! ) = log(1*2*3....... * n) = log(1) + log(2) + ........ +log(n)

    Now, observe that the floor value of log base 
    10 increased by 1, of any number, gives the
    number of digits present in that number.

    Hence, output would be : floor(log(n!)) + 1.*/

public class CDF0MATH {

    public static int digitCountFactorial(int number) {
        if(number<0){
           return 0;
        }
        if(number<=1){
            return 1;
        }
        double digits=0;
        for(int i=2;i<=number;i++){
            digits+=Math.log10(i);
        }
        return (int)(Math.floor(digits))+1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number To Find Number of Digits in it's factorial: ");
        int number = input.nextInt();
        //int size = numberSize(number);
        //int size = numberSizeLog(number);
        int size = digitCountFactorial(number);
        System.out.println("No of Digits in Factorial of Given Number is: "+size);
        input.close();
    }
    
}
