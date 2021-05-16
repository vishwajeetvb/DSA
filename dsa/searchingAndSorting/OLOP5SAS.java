
import java.util.Scanner;

public class OLOP5SAS {

    static int[] findTwoElement(int arr[], int size) {
        // code here
        int i;
        int re=0;
        int mi=0;
        
 
        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                re=abs_val;
        }
 
        
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                mi=i+1;
        }
        arr[0]=re;
        arr[1]=mi;
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int[] result = findTwoElement(arr,size);
        System.out.println("Repeating element is: "+result[0]+" Missing element is: "+result[1]);
        input.close();
    }
}
