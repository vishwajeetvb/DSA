/*
Idea is to use binarys erach along with arr[i-1] OR arr[i+1]
because the item is displaced at that place
T.C is O(nlogn)
*/

import java.util.Scanner;

public class CTS5SAS {

    static long closer(int arr[], int n, long x)
    {
        
        if(n<3){
            int i=n-1;
            while(i>=0){
              if(arr[i]==x){
                  return i;
              }  
              i--;
            }
            
        }
        int l = 0, r = n - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if ((m>0&&m<n-1)){
                if(arr[m] == x){
                    return m;
                }else if(arr[m-1]==x){
                    return m-1;
                }else if(arr[m+1]==x){
                    return m+1;
                }
            } 
                
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1;  
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter x: ");
        long x = input.nextInt();
        long inversion = closer(arr,size,x);
        
        System.out.print("Total no of inversion are: "+inversion);
        
        input.close();
    }
}
