/*
Our simple approach is to run binary search with some modificationw which gives us T.C O(logn)
*/
package searchingAndSorting;
import java.util.Scanner;

public class OIB5SAS {

    public static int countOnes(int arr[], int N){
        
        // Your code here
        if(arr[N-1]==1){
            return N;
        };
        int start=0;
        int last=N;
        int mid = (last+start)/2;
        while(start<last){
        if(arr[mid+1]==0&arr[mid]==1){
            return mid+18;
        }
        if(arr[mid+1]==1){
            start=mid+1;
            mid=(start+last)/2;
        }else{
            last=mid-1;
            mid=(start+last)/2;
        }
        }
        return 0;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Binary Array");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int count = countOnes(arr, size);
        System.out.println("Total no of 1 : "+count);
        input.close();

    }
}
