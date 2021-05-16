//Copied program from GFG..
//Not understanded till now

import java.util.Scanner;

public class MNJ1ARR {

    public static int MinimumNoOfJump(int[] arr, int size){
        if (arr.length <= 1) 
            return 0; 
  
        // Return -1 if not possible to jump 
        if (arr[0] == 0) 
            return -1; 
  
        // initialization 
        int maxReach = arr[0]; 
        int step = arr[0]; 
        int jump = 1; 
  
        // Start traversing array 
        for (int i = 1; i < arr.length; i++) { 
            // Check if we have reached  
// the end of the array 
            if (i == arr.length - 1) 
                return jump; 
  
            // updating maxReach 
            maxReach = Math.max(maxReach, i + arr[i]); 
  
            // we use a step to get to the current index 
            step--; 
  
            // If no further steps left 
            if (step == 0) { 
                // we must have used a jump 
                jump++; 
  
                // Check if the current  
// index/position or lesser index 
                // is the maximum reach point  
// from the previous indexes 
                if (i >= maxReach) 
                    return -1; 
  
                // re-initialize the steps to the amount 
                // of steps to reach maxReach from position i. 
                step = maxReach - i; 
            } 
        } 
  
        return -1; 
  
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Enter the ladder");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int obj = MinimumNoOfJump(arr,size);
        System.out.print("Minimum no of jump is: "+obj);
        input.close();
    }
}
