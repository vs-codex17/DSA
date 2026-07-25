package Pattern;
import java.util.Scanner;

public class RightHalf_pyramid {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no. : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int a=1; a<=i; a++){
                System.out.print("*");
            }
            for(int b=n-1; b!=1; b--){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
