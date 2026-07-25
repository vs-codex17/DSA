package Pattern;
import java.util.Scanner;

public class InvertedRightHalf_pyramid {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no. : ");
        int n =sc.nextInt();

        for(int i=n; i!=0; i--){
            for(int a=1; a<=i; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
