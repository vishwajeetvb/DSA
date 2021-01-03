
package dsa.array;

import java.util.Scanner;

public class KMAM1ARR {

    public static int kSmallestElement(int[] arr,int size,int k) {
        int ele=0;
        return ele;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the kth elemnt to find");
        int k = input.nextInt();
        System.out.print("Kth Smallest element is: "+kSmallestElement(arr,size,k));
        input.close();
    }
}
