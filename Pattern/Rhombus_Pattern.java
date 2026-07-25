package Pattern;
import java.util.Scanner;

public class Rhombus_Pattern {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no. : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int a=0; a<=i-1; a++){
                System.out.print(" ");
            }
            System.out.print("****");
            System.out.println("");
        }
    }
}
