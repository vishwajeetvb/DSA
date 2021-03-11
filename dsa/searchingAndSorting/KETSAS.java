import java.util.Scanner;

class KETSAS{
    public static long kthElement( int arr1[], int arr2[], int m, int n, int k) {
        
        int upper=0;
        int lower=0;
        int count=1;
        while(upper<m&&lower<n){
            if(arr1[upper]<arr2[lower]){
                if(count==k){
                    return arr1[upper];
                }
                upper++;
                count++;
            }else{
                if(count==k){
                    return arr2[lower];
                }
                lower++;
                count++;
            }
        }
        while(upper<m){
            if(k==count){
                return arr1[upper];
            }
            upper++;
        }
        while(lower<n){
            if(k==count){
                return arr2[lower];
            }
            lower++;
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
        System.out.println("Enter the Kth value");
        int k = input.nextInt();
        System.out.println("Kth element is: "+kthElement(arr1,arr2,size1,size2,k));
        input.close();
    }
}