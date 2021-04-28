import java.util.Arrays;
import java.util.Scanner;

//Implementation of string class methods

public class S6STR {
    public static void main(String[] args) {
        /*char[] chr = {'m','y'};
        Scanner input = new Scanner(System.in);
        String txt = "hello";
        System.out.println(txt.length());
        System.out.println(txt.charAt(2));
        System.out.println(txt.concat("myworld"));
        System.out.println(txt.contains("hello"));
        txt.concat("myworld");
       

        String word = "hello";
        String word2 = "hello";
        System.out.println(word.equalsIgnoreCase(word2));

        String way = "abcd";
        char[] a = way.toCharArray();
        for(char a1:a){
            System.out.println(a1);
        }*/

        String aa = "geeksforgeeks";
        String b = "forgeeksgeeks";

        char[] a1 = aa.toCharArray(); 
        Arrays.sort(a1);
        char[] a2 = b.toCharArray(); 
        Arrays.sort(a2);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a1.toString()==a2.toString());
        boolean a[][] = new boolean[a1.length][a1.length];
        for(int i=0;i<a.length;++i){
            a[i][i]=true;
        }

    }
}
