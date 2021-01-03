//W.A.P to reverse the array
//our algorithm complexity is O(n)

package dsa.array;

import java.util.Scanner;

class RAOARR{

    public static
     void reverseArray(int[] arr,int size){
        int start=0;
        int end=size-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
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
        reverseArray(arr,size);
        for(int array:arr){
            System.out.print(array+" ");
        }
        input.close();
    }
}