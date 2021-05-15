package array;
import java.util.ArrayList;
import java.util.Scanner;

public class CE3A1ARR {
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        //int min = Collections.min(n1,Collections.min(n2,n3));
        
        ArrayList<Integer> rtrn = new ArrayList<Integer>();
        int p1=0;
        int p2=0;
        int p3=0;
        while(p1<n1&&p2<n2&&p3<n3){
            if(A[p1]==B[p2]&&B[p2]==C[p3]){
                rtrn.add(A[p1]);
            }
            int min=A[p1];
            if(B[p2]<min){
                min=B[p2];
            }
            if(C[p3]<min){
               min=C[p3];
            }
            if(min==A[p1]){p1++;}
            if(min==B[p2]){p2++;}
            if(min==C[p3]){p3++;}
        }
        return rtrn;
        
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
        System.out.println("Enter the size of array3: ");
        int size3 = input.nextInt();
        int[] arr3 = new int[size3];
        for(int i=0;i<size3;i++){
            arr3[i]=input.nextInt();
        }
        ArrayList<Integer> obj = commonElements(arr1,arr2,arr3,size1,size2,size3);  
        
        System.out.print(obj);    

        input.close();
    }
}
