
//This algorithm does'nt cover all cases

import java.util.Scanner;

public class MPSA15DP {
    static long maxProduct(int[] arr, int n) {
        // code here
        
        if(arr.length==1){
            return arr[0];
        }
        
        int product = arr[0]*arr[1];
        int max_product=product;
        for(int i=2;i<n;){
            if(product*arr[i]>arr[i]){
                if(product*arr[i]==0){
                    product=arr[i];
                }else{
                product*=arr[i];}
                if(product>max_product)
                {max_product=product;}
                
                i++;
            }else{
                product=arr[i];
                i++;
            }
        }
        return max_product;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        
        long element = maxProduct(arr,size);  
        
        System.out.print("The product is: "+element);
    
    

        input.close();
    }
}
