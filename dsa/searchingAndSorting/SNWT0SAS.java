import java.util.Scanner;

public class SNWT0SAS {

    static boolean check(int p, int n)
    {
        int temp = p, count = 0, f = 5;
        while (f <= temp)
        {
            count += temp / f;
            f = f * 5;
        }
        return (count >= n);
    }
    
    static int findNum(int n)
    {
        // Complete this function
          // If n equal to 1, return 5.
        // since 5! = 120.
        if (n==1)
            return 5;
     
        // Initalising low and high for binary
        // search.
        int low = 0;
        int high = 5 * n;
     
        // Binary Search.
        while (low < high)
        {
            int mid = (low + high) >> 1;
     
            // Checking if mid's factorial 
            // contains n trailing zeroes.
            if (check(mid, n))
                high = mid;
            else
                low = mid + 1;
        }
     
        return low;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();        
        System.out.println("The Number is: "+findNum(n)); 
        input.close();
    }
}
