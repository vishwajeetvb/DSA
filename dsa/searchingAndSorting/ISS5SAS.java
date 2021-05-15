//Program to impelemnt shell sort
package searchingAndSorting;
import java.util.Scanner;

public class ISS5SAS {

    static void ShellSortArray(int[] array,int n){
        //This exterior loop to calculate the gaps
        for (int gap = n / 2; gap > 0; gap /= 2) {
            //This loop is to make pairs of all elements in gaps 
            for (int i = gap; i < n; i += 1) {  
             int temp = array[i];  
             int j;     
                //This loop is to check all the elements in paris if they need to swapped or not
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) { 
                    array[j] = array[j - gap];   
                }        
          array[j] = temp;   
          } 
          }
    } 
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        ShellSortArray(arr,size);
        for(int array:arr){
            System.out.print(array+" ");
        }
        input.close();
    }
}
