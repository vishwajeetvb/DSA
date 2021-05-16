
/*Here our approach is to traverse the array from backward and keep on traversing
untill we find a element which is smaller than current element
then we store that i in a index
then we again traverse the array untill index utill we found an element greater than element at index
then we swap both of them
then we sort the array from index+1 to N
so that we get just next permutation from current

And for all element greater we just sort the array and return it
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NP1ARR {
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        
        List<Integer> lst = new ArrayList<Integer>();
        
        
        int index = N-1;
        for(int i=N-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                index=i-1;
                break;
            }
        }
        
        if(index==N-1){
            ArrayList<Integer> temparr = new ArrayList<Integer>();
            for(int ele:arr){temparr.add(ele);}
            Collections.sort(temparr);
            lst.addAll(0,temparr);
            return lst;
        }
        int t = N-1;
        while(arr[index]>arr[t]){
            t--;
        }
        
        int temp=arr[index];
        arr[index]=arr[t];
        arr[t]=temp;
        
        ArrayList<Integer> temparr = new ArrayList<Integer>();
        for(int i=index+1;i<N;i++){
            temparr.add(arr[i]);
        }
        
        Collections.sort(temparr);
        
        
        for(int i=0;i<=index;i++){
            lst.add(arr[i]);
        }
        lst.addAll(index+1,temparr);
        return lst;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        List<Integer> obj = nextPermutation(size,arr);
        System.out.print(obj);
        input.close();  
    }
}
