package Arrays.Array_2D;
import java.util.Scanner;
public class Spiral_Matrix {
    public static void Spiral(int matrix[][]){
        int SR= 0, ER= matrix.length-1;
        int SC= 0, EC= matrix[0].length-1;

        while(SR<=ER && SC<=EC){
            //top
            for(int j= SC; j<=EC; j++){
                System.out.print (matrix[SR][j]+" ");
            }

            //Right
            for(int i= SR+1; i<=ER; i++){
                System.out.print(matrix[i][EC]+" ");
            }

            //Bottom
            for(int j=EC-1; j>=SC; j--){
                if(SR==ER){
                    break;
                }
                System.out.print(matrix[ER][j]+" ");
            }

            //left
            for(int i=ER-1; i>=SR+1; i--){
                if(SC==EC){
                    break;
                }
                System.out.print(matrix[i][SC]+" ");
            }
            SC++;
            SR++;
            EC--;
            ER--;
        }
        System.out.println();
    }

    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        Spiral(matrix);
    }
}
