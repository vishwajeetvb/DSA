//Write a Program to sort array Using Quick Sort using Hoare's Partition

package dsa.searchingAndSorting;

import java.util.Scanner;

public class HQS0ARR {

    public static int partition(int[] arr,int start,int last) {
        int i=start-1;
        int j=last+1;
        int pivot=arr[start];
        while(true){
            do{
              i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j){
                return j;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }


    public static void hoaresQuickSortArray(int[] arr,int start,int last) {
        if(start<last){
            int partition = partition(arr, start, last);
            hoaresQuickSortArray(arr, start, partition);
            hoaresQuickSortArray(arr, partition + 1, last);
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
        hoaresQuickSortArray(arr,0,size-1);
        for(int array:arr){
            System.out.print(array+" ");
        }
        input.close();
    }
    
}
