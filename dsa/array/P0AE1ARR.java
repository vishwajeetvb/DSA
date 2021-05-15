//Program to push all the zero to the end of array
//Our approach is to count all the non zero element and overwrite them with zeros
// and then at last overwrite all the excess index with 0

package array;
import java.util.Scanner;

public class P0AE1ARR {

    public static void push0AtEndOfTheArray(int[] arr, int size) {
        int count=0;
        for(int i=0;i<=size-1;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<=size-1){
            arr[count++]=0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        push0AtEndOfTheArray(arr,size);
        for(int i=0;i<=size-1;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
    
}
