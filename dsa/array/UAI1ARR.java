
import java.util.ArrayList;
import java.util.Scanner;

public class UAI1ARR {

    public static ArrayList<Integer> findIntersection(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        int i=0,j=0;
        while (i < n && j < m) { 
            if(arr1[i]==arr2[j]){
                if(i+1<n&&arr1[i+1]==arr1[i]){
                    i++;
                }
                else if(j+1<m&&arr2[j+1]==arr2[j]){
                    j++;
                }else{
                intersection.add(arr2[j]);
                i++; 
                j++;
                }
            }else if(arr1[i]<arr2[j]){
                i++;
            }
             else{
                 j++;
                }
        } 
  
        return intersection;
}

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> union = new ArrayList<Integer>();
        int i=0,j=0;
        while (i < n && j < m) { 
            if(i+1<n&&arr1[i+1]==arr1[i]){
                i++;
            }
            else if(j+1<m&&arr2[j+1]==arr2[j]){
                j++;
            }else if(arr1[i]==arr2[j]){
                union.add(arr1[i]);
                i++;
                j++;
            }else{
            if(arr1[i]!=arr2[j]){
                 union.add(arr1[1]<arr2[j]?arr1[i]:arr2[j]);
                 if(arr1[i]<arr2[j]){
                     i++;
                 }else{
                     j++;
                 }
            }
        }
        } 
  
        /* Print remaining elements of  
         the larger array */
        while (i < n) 
            {union.add(arr1[i]);
                i++; }
        while (j < m) 
            {union.add(arr2[j]);
                j++;} 
  
        return union;        
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

        ArrayList<Integer> union = findUnion(arr1, arr2, size1, size2);
        System.out.println(union);

        input.close();
    }
}
