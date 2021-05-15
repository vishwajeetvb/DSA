package searchingAndSorting;
import java.util.Arrays;
import java.util.Scanner;

class FAPGD5SAS {
    
    public static int pair(int[] arr, int size,int sum){
        Arrays.sort(arr);
        int i=size-2;
        int end=size-1;
        int result=arr[end];
        while(i>=0&&end>=0){
            result=result-arr[i];
            if(result==sum){
                return 1;
            }else if(result>sum){
                result=arr[end]-arr[end-1];
                end--;
                i--;
            }else{
                result=arr[end];
                i--;
            }
        }
        return -1;
    }
    
	public static void main (String[] args) {
		//code
		Scanner input = new Scanner(System.in);
		int testcase = input.nextInt();
		while(testcase-->0){
		    int size = input.nextInt();
		    int sum = input.nextInt();
            int[] arr = new int[size];
		    for(int i=0;i<size;i++){
		        arr[i]=input.nextInt();
		    }
		    
		    System.out.println(pair(arr,size,sum));            
		}
        input.close();
		
	}
}