
import java.util.Scanner;

public class NPS6STR {

    static boolean pattern(String txt,String pat,int si,int li){
        int j=0;
        for(int i=si;i<li;i++){
            if(pat.charAt(j)!=txt.charAt(i)){
                return false;
            }
            j++;
        }
        return true;
    }
    
    static boolean search(String pat, String txt)
    {
            // Your code here
            int j=pat.length()-1;
            for(int i=0;j<txt.length();){
                if(pattern(txt,pat,i++,j++)){
                    return true;
                }
            }           
            return false;
    }

    static boolean search2(String pat, String txt)
    {
            int M = pat.length(); 
	        int N = txt.length(); 

	        /* A loop to slide pat[] one by one */
	        for (int i = 0; i <= N - M; i++) { 
		                int j; 

		        /* For current index i, check for pattern match */
		        for (j = 0; j < M; j++) 
			        if (txt.charAt(i + j) != pat.charAt(j)) 
				        break; 

		        if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1] 
			        return true; 
	            }
	
	    return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String txt = input.next();
        String pat = input.next();
        if(search2(pat,txt)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        input.close();
    }
}
