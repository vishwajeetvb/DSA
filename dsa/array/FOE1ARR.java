package array;
import java.util.Scanner;

public class FOE1ARR {
    public static void frequency(int[] arr, int size) {
        int count=1;
        int i=1;
        for(;i<size-1;){
            count=1;
            while(i<size&&arr[i]==arr[i-1]){
                count++;
                i++;
            } 
            System.out.println("Frequency of element: "+arr[i-1]+" is "+count); 
            i++;
                       
        }
        System.out.println("Frequency of element: "+arr[size-1]+" is "+count); 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array to find frequency of all element");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        frequency(arr, size);
        
        input.close();
    }
}
