/*
  Idea is to use meger sort and use that process to find inversion
  Idea is when we have two arrays and we meger them
  in same way we divide array in two parts and sort them and 
  then when we right smaller element in right array means its a inversion
  just count it
*/
package searchingAndSorting;
import java.util.Scanner;

class IC5SAS{
    static long inversionCount(long arr[], long N)
    {
        return countInv(arr,0,N-1);
    }
    static long countInv(long arr[], long l, long r)
    {
        long res = 0;
        if (l<r) {
           
            long m = (r + l) / 2;
     
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += countAndMerge(arr, l, m , r);
        }
        return res;
    }
    
    static long countAndMerge(long arr[], long l, long m, long r)
    {
        long n1=m-l+1, n2=r-m;
        long[] left=new long[(int)n1];long[] right=new long[(int)n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[(int)(i+l)];
        for(int j=0;j<n2;j++)
            right[j]=arr[(int)(m+1+j)];    
        long res=0;
        int i=0,j=0,k=(int)l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                {arr[k++]=left[i++];}
            else{
                arr[k++]=right[j++];
                res=res+((int)(n1-i));
            }
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        long size = input.nextInt();
        long[] arr = new long[(int)size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextLong();
        }
        long inversion = inversionCount(arr,size);
        
        System.out.print("Total no of inversion are: "+inversion);
        
        input.close();
    }
}