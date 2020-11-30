//Write a Program To count number of digits in a given Number

package dsa.mathematics;
import java.util.Scanner;

class CDOMATH{

    //T.C is 0(d), where d is no of digits
    public static int numberSize(int number) {
        int size=0;
        while(number>0){
            number/=10;
            size++;            
        }
        return size;
    }

    //This method use the log function with base 10 to count number of digits
    //T.C depends of Method of Java
    public static int numberSizeLog(int number) {
        return (int)Math.floor(Math.log10(number)+1);
    }

    //This Method change the given Number into String and count length of String
    //T.c is 0(1)
    public static int numberSizeString(int number){
        String num = Integer.toString(number);
        return num.length();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number To Find Number of Digits: ");
        int number = input.nextInt();
        //int size = numberSize(number);
        //int size = numberSizeLog(number);
        int size = numberSizeString(number);
        System.out.println("No of Digits in Given Number is: "+size);
        input.close();
    }
}