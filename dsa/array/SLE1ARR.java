//Program to Find out seocnd largest number in an array
//Our approach is to have two integer which keep track of first largest and second largest element
//Time complexity is O(n)

package dsa.array;

import java.util.Scanner;

public class SLE1ARR {

    public static int secondLargestElement(int[] arr,int size) {
        int firstMax=0;
        int secondMax=0;

        if(size==1){
            firstMax=secondMax=arr[0];
        }
       
        if(size>=2){
            if(arr[0]>arr[1]){
                firstMax = arr[0];
                secondMax = arr[1];
            }else{
                firstMax=arr[1];
                secondMax=arr[0];
            }
        }

        for(int i=2;i<=size-1;i++){
            if(arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];                
             }
            else if(arr[i]>secondMax&&arr[i]!=secondMax){
                secondMax=arr[i];
            }
        } 
        return secondMax;       
        }
       
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int ele = secondLargestElement(arr,size);
        System.out.print("Second Max element is: "+ele);
        input.close();
    }
}
