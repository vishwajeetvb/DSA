/*Here the idea is keep track of day from first day utill the price is rising once price falls
  print that interval from 0-that i-1
  then start from next day and keep track untill price fall and again print
*/

package array;

import java.util.ArrayList;
import java.util.Scanner;

public class BTBSS1ARR {

    public static ArrayList<ArrayList<Integer>> stockBuySell(int arr[], int n) {
        // code here
        
        ArrayList<ArrayList<Integer>> main = new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<n;){
            if(arr[i]>arr[i-1]){
            ArrayList<Integer> sub = new ArrayList<Integer>();
            sub.add(i-1);
            while(i<n&&arr[i]>=arr[i-1]){
                i++;
            }
            sub.add(i-1);
            main.add(sub);
            }
            i++;
        }
        return main;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        
        ArrayList<ArrayList<Integer>> element = stockBuySell(arr,size);  
        
        System.out.print(element);   

        input.close();
    }
    
}
