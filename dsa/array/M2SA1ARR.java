
//First Solution..................
//In This approach we use the idea of selection sort where we choose the first element
//of secodn array and compare it with each element of first array and
//when we found any element greater the array2[0] we swap them
//then we sort the second aary again so that smallest element in secodn array comes in first place
//again we start traversing with arr1[i] and arr2[0]
//and we keep on swapping when we found element bigger in array1 compared to element in array2
//untill last element of array1

//It's time complexity will be O(m*nlogn)
//It's one approach which solve the problem with O(1) T.C.
//But it gives T.L.E in competative


import java.util.Scanner;

public class M2SA1ARR {

    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
 

    public static void MergeTwoArray(int arr1[],int size1,int[] arr2,int size2){
          for(int i=0;i<size1;i++){
              if(arr1[i]>arr2[0]){
                //swap  
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                //sort
                sort(arr2,0,size2-1);
              }
          }
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
        MergeTwoArray(arr1,size1,arr2,size2);  
        
        System.out.print("Sorted arrays is: ");
    for(int ele:arr1){System.out.print(ele+" ");}
    for(int ele:arr2){System.out.print(ele+" ");}

        input.close();
    }
}
