import java.util.Scanner;

public class WASON4HASH {

    static String subSetOrNot(int[] arr1,int[] arr2,int size1, int size2){
        
        

        return "No";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while(testcase-->0){
             int size1 = input.nextInt();
             int size2 = input.nextInt();

             int[] arr1 = new int[size1];
             int[] arr2 = new int[size2];

             for(int i=0;i<size1;i++){
                 arr1[i]=input.nextInt();
             }
             
             for(int i=0;i<size2;i++){
                arr2[i]=input.nextInt();
            }

            String result = subSetOrNot(arr1,arr2,size1,size2);
            System.out.println(result);

        }

        input.close();
    }
}
