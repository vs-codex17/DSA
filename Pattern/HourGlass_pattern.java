package Pattern;
import java.util.Scanner;

public class HourGlass_pattern {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no. : ");
        int n = sc.nextInt();

        for(int i=n; i!=0; i--){
            for(int a=0; a<=n-i; a++){
                System.out.print(" ");
            }
            for(int b=1; b<=2*i-1; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int e=2; e<=n; e++){
            for(int c=0; c<=n-e; c++){
                System.out.print(" ");
            }
            for(int d=1; d<=2*e-1; d++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
