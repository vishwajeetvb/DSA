import java.util.Scanner;
public class SSA1ARR {
    public static long sb(long arr[], long n, long x) {
        int curr_sum = 0, min_len = (int)n + 1; 
  
        // Initialize starting and ending indexes 
        int start = 0, end = 0; 
        while (end < n)  
        { 
            // Keep adding array elements while current sum 
            // is smaller than x 
            while (curr_sum <= x && end < n) 
                curr_sum += arr[end++]; 
  
            // If current sum becomes greater than x. 
            while (curr_sum > x && start < n)  
            { 
                // Update minimum length if needed 
                if (end - start < min_len) 
                    min_len = end - start; 
  
                // remove starting elements 
                curr_sum -= arr[start++]; 
            } 
        } 
        return min_len;         
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int size = input.nextInt();
        long[] arr = new long[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the desired sum");
        int sum = input.nextInt();
        
        long result = sb(arr,size,sum);  
        
        System.out.println("result is "+result);  

        input.close();
    }
}
