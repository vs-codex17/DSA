package Pattern;
import java.util.Scanner;

public class invertedLeft_halfPyramid {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no. : ");
        int n = sc.nextInt();

        for(int i=n; i!=0; i--){
            for(int a=0; a<=n-i; a++){
                System.out.print(" ");
            }
            for(int b=i; b!=0; b--){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}