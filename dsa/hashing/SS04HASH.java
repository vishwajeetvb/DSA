
import java.util.Scanner;

public class SS04HASH {
    static boolean findsum(int arr[],int n)
{
    //Your code here
    if(arr[0]==0){return true;}
    int curr_sum=arr[0]+arr[1];
    int start=0;
    int i;
    for(i=2;i<=n;i++){
        if(curr_sum==0){
            return true;
        }
        if(curr_sum>0&&start<=i-1){
            if(arr[start]>0)
            curr_sum-=arr[start];
            start++;
        }
        if(i<n){
            curr_sum+=arr[i];
        }
    }
    return false;
    
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }        
        
        System.out.print(findsum(arr,size));
        
        input.close();
    }
}

