
import java.util.Scanner;

public class M2SA5SAS {

    public static int findMedian(int a1[], int n1, int a2[], int n2){
        //Your code here
        int begin1 = 0, end1 = n1;
    
            while(begin1 < end1)
            {
                int i1 = (begin1 + end1) / 2;
                int i2 = ((n1 + n2 + 1) / 2 )- i1;
    
                int min1 = (i1 == n1)?Integer.MAX_VALUE:a1[i1];
                int max1 = (i1 == 0)?Integer.MIN_VALUE:a1[i1 - 1];
                
                int min2 = (i2 == n2)?Integer.MAX_VALUE:a2[i2];
                int max2 = (i2 == 0)?Integer.MIN_VALUE:a2[i2 - 1];
    
                if(max1 <= min2 && max2 <= min1)
                {
                    if((n1 + n2) % 2 == 0)
                        return (Math.max(max1, max2) + Math.min(min1, min2)) / 2;
                    else
                        return  Math.max(max1, max2);
                }
                else if(max1 > min2)
                    end1 = i1 - 1;
                else 
                    begin1 = i1 + 1;
            }
            
            return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0;i<size1;i++){
            arr1[i]=input.nextInt();
        }
        System.out.println("Enter the size of array2: ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0;i<size2;i++){
            arr2[i]=input.nextInt();
        }
         
        int median = findMedian(arr1, size1, arr2, size2);
        System.out.println("The Median of Two Sorted Arrays is: "+median);
        input.close();
    }
}
