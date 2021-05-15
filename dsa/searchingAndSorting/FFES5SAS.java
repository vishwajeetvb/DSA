package searchingAndSorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FFES5SAS {

    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> quad = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> ele = new ArrayList<Integer>();
        Arrays.sort(arr);
        int start=2;
        int n=arr.length;
        int end=n-1;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                start=j+1;
                end=n-1;
                while(start<end){
                    
                    if((arr[i]+arr[j]+arr[start]+arr[end])==k){                        
                        ele.add(0,arr[i]);
                        ele.add(1,arr[j]);
                        ele.add(2,arr[start]);
                        ele.add(3,arr[end]);
                        quad.add(ele);
                        
                        start++;
                        end--;                        
                    }
                    else if((arr[i]+arr[j]+arr[start]+arr[end])<k){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }
        
        return quad;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter desired sum");
        int sum = input.nextInt();
        ArrayList<ArrayList<Integer>> quad = fourSum(arr,sum);
        for(ArrayList<Integer> v:quad){
            for(int ele:v){
                System.out.print(ele+" ");
            }
            System.out.println("$");            
        }

        input.close();

        
    }
}
