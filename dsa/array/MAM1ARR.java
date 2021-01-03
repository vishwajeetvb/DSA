
//Find the maximum and minimum element in an array
//Our algorithm complexity is O(n)

package dsa.array;

import java.util.Scanner;

public class MAM1ARR {
    int max;
    int min;

    public static MAM1ARR maxAndMinArray(int[] arr,int size) {
        MAM1ARR obj = new MAM1ARR();
        if(size==1){
            obj.max=arr[0];
            obj.min=arr[0];
            return obj;
        }
        if(size==2){
            if(arr[0]>arr[1]){
                obj.max=arr[0];
                obj.min=arr[1];
                return obj;
            }
            else{
                obj.max=arr[1];
                obj.min=arr[0];
                return obj;
            }
        }
        obj = maxAndMinArray(arr, 2);
        for(int i=2;i<size;i++){
            if(arr[i]>obj.max){
                obj.max=arr[i];
            }
            else if(arr[i]<obj.min){
                obj.min=arr[i];
            }
        }
        return obj;        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        MAM1ARR obj = maxAndMinArray(arr,size);
        System.out.print("Max element is: "+obj.max+" Min element is: "+obj.min);
        input.close();
    }
}
