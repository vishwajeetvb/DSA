package string;
import java.util.Scanner;

public class SOS6STR {

    public static boolean isSubSequence(String A, String B)
{
         
    int Bend = B.length()-1;
    int Aend = A.length()-1;
    if(Bend==0||Aend==0){
        if(B.charAt(Bend)==A.charAt(Aend)){
            return true;
        }else{
            return false;
        }
    }
    while(Bend>0&&Aend>0){
        if(B.charAt(Bend)==A.charAt(Aend)){
            Bend--;
            Aend--;
        }else{
            Bend--;
        }
    }
    if(Aend<=0){
        return true;
    }else{
       return false; 
    }
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
