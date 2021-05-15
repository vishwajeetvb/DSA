/*
First we sort the using quicksort so that we can use two pointer approach
 
In This Algo our approach is to first fixed the first element of arr
then we do sum-arr[0] and we get a req_sum then we use two pointer and
 find from remaining array is there is an pair whose sum is equal to
 req sum means we get a triplet
 else we now fixed arr[1] and then we find triplet and like this we
 search whole array
 Whose T.C is O(n*n+nlogn)
*/
package array;
import java.util.Scanner;

public class TSGV1ARR {

    
    
     static int IsTriplet(int A[], int arr_size, int sum) { 
    
        // Your code Here
        int l, r; 
   
         /* Sort the elements */
         quickSort(A, 0, arr_size - 1); 
   
         /* Now fix the first element one by one and find the 
            other two elements */
         for (int i = 0; i < arr_size - 2; i++) { 
   
             // To find the other two elements, start two index variables 
             // from two corners of the array and move them toward each 
             // other 
             l = i + 1; // index of the first element in the remaining elements 
             r = arr_size - 1; // index of the last element 
             while (l < r) { 
                 if (A[i] + A[l] + A[r] == sum) { 
                     return 1; 
                 } 
                 else if (A[i] + A[l] + A[r] < sum) 
                     l++; 
   
                 else // A[i] + A[l] + A[r] > sum 
                     r--; 
             } 
         } 
   
         // If we reach here, then no triplet was found 
         return 0; 
     } 
   
     static int partition(int A[], int si, int ei) 
     { 
         int x = A[ei]; 
         int i = (si - 1); 
         int j; 
   
         for (j = si; j <= ei - 1; j++) { 
             if (A[j] <= x) { 
                 i++; 
                 int temp = A[i]; 
                 A[i] = A[j]; 
                 A[j] = temp; 
             } 
         } 
         int temp = A[i + 1]; 
         A[i + 1] = A[ei]; 
         A[ei] = temp; 
         return (i + 1); 
     } 
   
     /* Implementation of Quick Sort 
     A[] --> Array to be sorted 
     si  --> Starting index 
     ei  --> Ending index 
      */
     static void quickSort(int A[], int si, int ei) 
     { 
         int pi; 
   
         /* Partitioning index */
         if (si < ei) { 
             pi = partition(A, si, ei); 
             quickSort(A, si, pi - 1); 
             quickSort(A, pi + 1, ei); 
         } 
     
     }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the desired sum");
        int sum = input.nextInt();
        
        int result = IsTriplet(arr,size,sum);  
        
        if(result==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    
    

        input.close();
    }
    
}
