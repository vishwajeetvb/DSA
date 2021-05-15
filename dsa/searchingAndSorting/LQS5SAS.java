////Write a Program to sort array Using Quick Sort using Lomudo's Partition
package searchingAndSorting;
import java.util.Scanner;

public class LQS5SAS {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high); // get the correct position of the pivot
            quickSort(arr, low, partition - 1); // call quickSort on the sub-left array
            quickSort(arr, partition + 1, high); // call quickSort on the sub-right array
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // pick the last element as the pivot
        int i = low; // initially set i to low
        for(int j = low; j < high; j++) { // loop through all array elements
            if (arr[j] < pivot) {
                swap(arr, i, j); // move elements less than pivot to the correct order by swapping arr[i] with arr[j]
                i++; // increase i to the next array position
            }
        }
        swap(arr, i, high); // swap the pivot to the correct position
        return i; // return the index of the pivot
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        quickSort(arr,0,size-1);
        for(int array:arr){
            System.out.print(array+" ");
        }
        input.close();
    }
}
