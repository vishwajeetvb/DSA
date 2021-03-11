import java.util.Arrays;
import java.util.Scanner;

public class ACSAS {

     static int check(int N,int C,int num,int stalls[])
{  

	int cows=1,pos=stalls[0];
	for (int i=1; i<N; i++)
	{
		if (stalls[i]-pos>=num)
		{
			pos=stalls[i];
			cows++;
			if (cows==C)
				return 1;
		}
	}
	return 0;
}

static int binarySearch(int N,int cows,int[] stalls)
{
    
	int start=0,end=stalls[N-1],max=-1;
	while (end>start)
	{
		int mid=(start+end)/2;
		if (check(N,cows,mid,stalls)==1)
		{
			if (mid>max)
				max=mid;
			start=mid+1;
		}
		else
			end=mid;
	}
	return max;
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while(testcase-->0){
            int no_of_stall = input.nextInt();
            int no_of_cows = input.nextInt();
            int[] stall_location = new int[no_of_stall];
            for(int i=0;i<no_of_stall;i++){
                stall_location[i]=input.nextInt();
            }
            Arrays.sort(stall_location);
            System.out.println(binarySearch(no_of_stall,no_of_cows,stall_location));

        }       
        
        input.close();
    }
}
