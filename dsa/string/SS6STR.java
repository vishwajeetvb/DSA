import java.util.Scanner;

public class SS6STR {

    public static boolean isSubSequence(String A, String B)
    {
        //code here
        int la = A.length();
        int lb = B.length();
        int i=0;
        int j=0;
        for(;i<lb;i++){
            if(A.charAt(j)==B.charAt(i))            {
                
                j++;
            }
            if(j==la){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        if(isSubSequence(A, B)){
            System.out.println("Yes");
        }else{
            System.out.println("False");
        }
        input.close();
    }
}
