package Pattern;
import java.util.Scanner;

public class Kajukatli {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no. : ");
        int n =sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int a=0; a<=(n-i); a++){
                System.out.print(" ");
            }
            for(int b=1; b<=2*i-1; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int c=n-1; c!=0; c--){
            for(int d=0; d<=n-c; d++){
                System.out.print(" ");
            }
            for(int e=1; e<=2*c-1; e++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
