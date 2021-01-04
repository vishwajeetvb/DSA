//Task is to push negative elements oinf front and positive at end of array
//Our approach is to swap with help of two pointers from startig and end of array
//Time complexity fo our approach is  O(n) with O(1) space 


import java.util.Scanner;

public class NE1ARR {
public static void pushNegative(int[] arr, int size) {
    int j=size-1;
    int i=0;
    while(i<=j){
           if(arr[i]>=0){
               if(arr[j]<0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j--;
                    i++;
            }else{
                j--;
            }
           }else if(arr[i]<0){
               i++;
           }           
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
        pushNegative(arr,size);
        for(int i=0;i<=size-1;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
