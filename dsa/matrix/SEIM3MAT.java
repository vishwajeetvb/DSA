package matrix;
import java.util.Scanner;

class SEIM3MAT {

    public static boolean searchMatrix(int[][] matrix, int target) {
        
        int top=0;
        int down = matrix[0].length-1;
        if(matrix[0][0]==target){return true;}
        while(top<matrix.length&&down>=0){
            if(matrix[top][down]==target){
                return true;
            }
            if(target<matrix[top][down]){
                down--;
            }
            else if(target>matrix[top][down]){
                top++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int msize = input.nextInt();
        int nsize = input.nextInt();
        System.out.println("Enter the matrix");
        int[][] arr = new int[msize][nsize];
        for(int i=0;i<msize;i++){
            for(int j=0;j<nsize;j++){
                arr[i][j]=input.nextInt();
            }
        } 
        System.out.println("Enter the number to find");
        int target = input.nextInt();
        System.out.println("Element present: "+searchMatrix(arr,target));
        input.close();
    }

}
