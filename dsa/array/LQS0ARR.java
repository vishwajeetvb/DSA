////Write a Program to sort array Using Quick Sort using Lomudo's Partition


package dsa.array;

import java.util.Scanner;

public class LQS0ARR {

    public static int partition(int[] arr,int start,int last) {
        int pivot = arr[last];
        int firstPointer=start-1;
        int secondPointer=start;
        for(;secondPointer<=last-1;secondPointer++){
            if(arr[secondPointer]<pivot){
                firstPointer++;
                int temp=arr[firstPointer];
                arr[firstPointer]=arr[secondPointer];
                arr[secondPointer]=temp;
            }            
        }
        int temp=arr[firstPointer+1];
        arr[firstPointer+1]=arr[last];
        arr[last]=temp;
        return firstPointer+1;        
    }


    public static void lomudoQuickSortArray(int[] arr,int start,int last) {
        if(start<last){
            int partition = partition(arr, start, last);
            lomudoQuickSortArray(arr, start, partition - 1);
            lomudoQuickSortArray(arr, partition + 1, last);
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
        lomudoQuickSortArray(arr,0,size-1);
        for(int array:arr){
            System.out.print(array+" ");
        }
        input.close();
    }
}
