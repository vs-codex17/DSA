package Arrays.Array_2D;
import java.util.Scanner;
public class Creation {
    public static boolean search(int matrix[][], int key){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]== key){
                    System.out.println("key found at cell ("+ i+ ","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[3][3];
        int m= matrix.length, n= matrix[0].length;  // m is row and n is column

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
    }
}
