

/*
Our approach is simpel where we check for the element is bigger than its leftmost element and snaller then rightmost element
OR if Oth element it should be bigger than rightmost
OR if n-1th element it shoudle be bigger than leftmost element

Now to find than element we do bianry serach we check if in mid
if mid elemnet leftmost element is bigger we move left otherwise we move right

for element we check if its 0th elemnet or n-1th elemenet & 
if its 0th elements then its rightmost element is smaller
OR
if its n-1th element then its leftmost element is smaller too
then return element

T.C is O(log n)
*/

import java.util.Scanner;

public class PE5SAS {

    public static int peakElement(int[] arr,int n)
    {
       
       int low = 0;
        int high = n-1;
       while(low<=high){
           int mid = (low+high)/2;
           if((mid==0||arr[mid-1]<=arr[mid])&&(mid==n-1||arr[mid+1]<=arr[mid])){
               return mid;
           }
           if(mid>0&&arr[mid-1]>=arr[mid]){
               high=mid-1;
           }
           else{
                low=mid+1;
           }
       }
       return -1;
       
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int count = peakElement(arr, size);
        System.out.println("The Peak Element is : "+arr[count]);
        input.close();
    }
}
