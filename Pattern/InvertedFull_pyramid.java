package Pattern;
import java.util.Scanner;

public class InvertedFull_pyramid {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no. : ");
        int n = sc.nextInt();

        for(int i=n; i!=0; i--){
            for(int a=0; a<=(n-i); a++){
                System.out.print(" ");
            }
            for(int b=1; b<=2*i-1; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
