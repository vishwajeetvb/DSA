/*In This algo, our approach is to increase the number at that index which element is repeated
For exmaple if 2 is repeated two times then we increase the value of the elemnet at index 2
as many times as its repeated
Now steps will be we traverse through the array and we keep on increase the value (size of array)times 
at the place which element is there at ith index
means suppose if element is 4 at 0 index that means we increase the value by size times at 4 index
so that if we encounter the same element again then we will increase the value at same value index by size times
which reuslt in value greater than size*2, so that we get to know 
this element is repeated twice

It's T.C O(n) & A.S.C O(1)
*/
import java.util.Scanner;

public class DIA1ARR {

    public static int findDuplicate(int[] arr) {
        int element=arr[0];
        int size=arr.length;
        for(int i=0;i<size;i++){
            arr[arr[i]%size]+=size;
        }
        for(int i=0;i<size;i++){
            if(arr[i]>size*2){element=i;};
        }
        return element;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        
        int element = findDuplicate(arr);  
        
        System.out.print("The element is: "+element);
    
    

        input.close();
    }
}
