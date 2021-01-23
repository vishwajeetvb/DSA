
//Here Our approach is to compare currentmax sum + next element sum is greater than current elemnt
//if its greater that means we keep on adding element into array
//if it's not that means current element is giving more sum than previous subarray so we update teh current sum

//Now result is maintained if we found previously with an subarray max sum so we compare this with each subarray
// so that we can print the maximum sum

//This algo T.C is O(n)

import java.util.Scanner;

class KD1ARR{

    public static int MaxSumSubarray(int[] arr,int size){
       int sum=arr[0];
       int result=sum;
        for(int i=0;i<size-1;i++){
               if(arr[i]-arr[i+1]>arr[i+1]){
                   sum=sum+arr[i+1];
               }else{
                   sum=arr[i+1];
               }
               result=result>sum?result:sum;

       }
       return result;
    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int obj = MaxSumSubarray(arr,size);
        System.out.print("Max Sum is: "+obj);
        input.close();
}
}