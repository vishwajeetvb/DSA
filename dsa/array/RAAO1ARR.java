/*
The idea is simple to have two pointer starting from index 0 and 1 resp.
and we keep on swap negative and positive element by taking 2 step at a time
T.C is O(n)
*/
import java.util.Scanner;

public class RAAO1ARR {
    static void rearrange(int arr[],int n){
    
        int i,j;
        if(arr[0]>0){
            i=1;
            j=2;
        }else{
            i=0;
            j=1;}
        
        for(;i<n&&j<n;){
            if(arr[i]>=0&&arr[j]<0){
              int temp = arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              i+=2;
              j+=2;
            }else if(arr[j]>0){
                j+=2;
            }else{
                i+=2;
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
        rearrange(arr,size);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        input.close();
    }
}
