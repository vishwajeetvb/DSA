//Program to cyclically rotate an array by D places 
//Here we have used two approach one with O(n) T.C && O(n) space complexity
//Another with O(n) but with constant space

import java.util.Scanner;

public class CR1ARR {
    
    public static void cyclicallyrotateDPlacesByDividing(int[] arr, int size, int place) {
       int[] temp = new int[size];
       int tempVar = arr[place];
       temp[0]=tempVar;
       int j=1;
        for(int i=place+1;i<=size-1;i++){           
           temp[j]=arr[i];
           j++;
        }
        
        for(int i=0;i<place;i++){
            temp[j]=arr[i];
            j++;
        }

        for(int i=0;i<=size-1;i++){
            arr[i]=temp[i];
        }
        
    }

    
    public static void reverse(int[] arr, int startIndex, int lastIndex) {
        while(startIndex<lastIndex){
            int temp=arr[startIndex];
            arr[startIndex]=arr[lastIndex];
            arr[lastIndex]=temp;
            startIndex++;
            lastIndex--;
        }
    }
    
    public static void cyclicallyrotateDPlacesByReversing(int[] arr,int size,int place) {
        reverse(arr,0,place-1);
        reverse(arr,place,size-1);
        reverse(arr, 0, size-1);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter no place you want to rotate the array");
        int place = input.nextInt();
        cyclicallyrotateDPlacesByReversing(arr,size,place);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        input.close();
    }
}
