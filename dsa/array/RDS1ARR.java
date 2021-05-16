/* Here one function is with temparr another is without using  anothr arr
*/

import java.util.Scanner;

public class RDS1ARR {
    public static int removeDuplicatesArray(int[] arr, int size) {
        int[] temp = new int[size];
        int j=0;
        for(int i=0;i<size-1;i++){
           if(arr[i]!=arr[i+1]){
               temp[j]=arr[i];
               j++;
           }
        }
        temp[j]=arr[size-1];
        for(int i=0;i<=j;i++){
            arr[i]=temp[i];            
        }
        return j;        
    }

    public static int removeDuplicatesArrayWithoutTempArray(int[] arr,int size){
        int arr_size=1;
        int curr_ele = arr[0];
        for(int i=1;i<size;){
           if(curr_ele==arr[i]){
               i++;
           }
           else{
              arr[arr_size]=arr[i];
              curr_ele=arr[i];
              i++;
              arr_size++;
              
           }
        }
        return arr_size-1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int index = removeDuplicatesArrayWithoutTempArray(arr,size);
        for(int i=0;i<=index;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
